package org.callmemaybe;

import static org.callmemaybe.translator.CommentTranslator.processCondition;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.callmemaybe.conf.Configuration;
import org.callmemaybe.extractor.DocumentedExecutable;
import org.callmemaybe.extractor.DocumentedType;
import org.callmemaybe.extractor.JavadocExtractor;
import org.callmemaybe.extractor.ParameterNotFoundException;
import org.callmemaybe.generator.OracleGenerator;
import org.callmemaybe.output.util.JsonOutput;
import org.callmemaybe.translator.CommentTranslator;
import org.callmemaybe.translator.semantic.SemanticMatcher;
import org.callmemaybe.translator.spec.EqOperationSpecification;
import org.callmemaybe.translator.spec.ProtocolSpecification;
import org.callmemaybe.util.GsonInstance;
import org.callmemaybe.util.Stats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;
import randoop.condition.specification.Guard;
import randoop.condition.specification.OperationSpecification;
import randoop.condition.specification.Postcondition;
import randoop.condition.specification.Precondition;
import randoop.condition.specification.Property;
import randoop.condition.specification.ThrowsCondition;

/**
 * Entry point of CallMeMaybe. {@code CallMeMaybe.main} is automatically executed running the command: {@code java
 * -jar callmemaybe.jar}.
 */
public class CallMeMaybe {

    /**
     * Command to run CallMeMaybe. This string is used only in output messages.
     */
    private static final String TORADOCU_COMMAND = "java -jar callmemaybe.jar";
    /**
     * CallMeMaybe's configurations.
     */
    public static Configuration configuration = null;
    /**
     * Logger of this class.
     */
    private static Logger log;

    /**
     * Entry point for CallMeMaybe. Takes several command-line arguments that configure its behavior.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        configuration = Configuration.INSTANCE;
        final JCommander jCommander =
                JCommander.newBuilder().addObject(configuration).programName(TORADOCU_COMMAND).build();
        try {
            jCommander.parse(args);
        } catch (ParameterException e) {
            e.getJCommander().usage();
            System.out.println(e.getMessage());
            System.exit(1);
        }
        configuration.initialize();

        if (configuration.help()) {
            jCommander.usage();
            System.out.println("Options preceded by an asterisk are required.");
            System.exit(1);
        }

        if (configuration.debug()) {
            System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "trace");
        }

        // Suppress non-error messages from Stanford parser (some of the messages directly printed on
        // standard error are still visible).
        System.setProperty(SimpleLogger.LOG_KEY_PREFIX + "edu.stanford", "error");
        log = LoggerFactory.getLogger(CallMeMaybe.class);

        // === Javadoc Extractor ===

        List<DocumentedExecutable> members = null;
        DocumentedType documentedType = null;
        final String targetClass = configuration.getTargetClass();
        if (configuration.getConditionTranslatorInput() == null) {
            final JavadocExtractor javadocExtractor = new JavadocExtractor();
            try {
                documentedType = javadocExtractor.extract(targetClass, Configuration.sourceDir.toString());
                members = documentedType.getDocumentedExecutables();
            } catch (ParameterNotFoundException e) {
                log.error(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
                System.exit(1);
            } catch (ClassNotFoundException e) {
                log.error( // TODO Refine this error message for the specific caught exception.
                        e.getMessage()
                                + "\nPossible reasons for the error are:"
                                + "\n1. The Javadoc documentations is wrong"
                                + "\n2. The path to the source code of your system is wrong: "
                                + configuration.sourceDir
                                + "\n3. The path to the binaries of your system is wrong: "
                                + configuration.classDirs
                                + "\nPlease, check the correctness of the command line arguments."
                                + "\nIf the error persists, report the issue at "
                                + "https://github.com/albertogoffi/callmemaybe/issues"
                                + "\nError stack trace:\n"
                                + Arrays.toString(e.getStackTrace()));
                System.exit(1);
            } catch (IOException e) {
                e.printStackTrace(); // TODO Print a more meaningful message!
                System.exit(1);
            }
        }

        if (configuration.getJavadocExtractorOutput() != null) { // Print collection to the output file.
            try (BufferedWriter writer =
                         Files.newBufferedWriter(
                                 configuration.getJavadocExtractorOutput().toPath(), StandardCharsets.UTF_8)) {
                writer.write(GsonInstance.gson().toJson(members));
            } catch (Exception e) {
                log.error(
                        "Unable to write the output on file "
                                + configuration.getJavadocExtractorOutput().getAbsolutePath(),
                        e);
            }
        }
        if (configuration.debug()) {
            log.debug("Constructors/methods found in source code: " + members);
        }

        // === Condition Translator ===

        // Enable or disable semantic matching
        SemanticMatcher.setEnabled(
                configuration.isSemanticMatcherEnabled() && !configuration.mustGenerateCrossOracles());

        if (configuration.isConditionTranslationEnabled()) {
            Map<DocumentedExecutable, OperationSpecification> specifications = new HashMap<>();
            Map<DocumentedExecutable, EqOperationSpecification> eqSpecifications = new HashMap<>();
            Map<DocumentedExecutable, ProtocolSpecification> temporalProtocols = new HashMap<>();

            List<JsonOutput> jsonOutputs = new ArrayList<>();
            if (configuration.mustGenerateCrossOracles()) {
                eqSpecifications = CommentTranslator.mapExecutablesToCrossOracles(documentedType);
                // Use @tComment or the standard condition translator to translate comments.
                //      } else if (configuration.useTComment()) {
                //        specifications = tcomment.TcommentKt.translate(members);
            } else if (configuration.mustGenerateTPs()) {
                temporalProtocols =
                        CommentTranslator.mapExecutablesToProtocolSpecs(documentedType);
            } else {
                specifications = CommentTranslator.createSpecifications(members);
            }

            // Output the result on a file or on the standard output, if silent mode is disabled.
            if (!configuration.isSilent()) {
                if (configuration.mustGenerateCrossOracles() && !eqSpecifications.isEmpty()) {
                    // Cross-oracles goal output
                    if (configuration.getConditionTranslatorOutput() != null) {
                        try (BufferedWriter writer =
                                     Files.newBufferedWriter(
                                             configuration.getConditionTranslatorOutput().toPath(),
                                             StandardCharsets.UTF_8)) {
                            Collection<EqOperationSpecification> equivalences = eqSpecifications.values();
                            if (!equivalences.isEmpty()) {
                                for (DocumentedExecutable executable : members) {
                                    jsonOutputs.add(new JsonOutput(executable, eqSpecifications.get(executable)));
                                }
                                String jsonOutput = GsonInstance.gson().toJson(jsonOutputs);
                                writer.write(jsonOutput);
                            } else {
                                // FIXME ugly, but we don't want empty JSON files around for now
                                File file = new File(configuration.getConditionTranslatorOutput().toURI());
                                file.delete();
                            }
                        } catch (Exception e) {
                            log.error(
                                    "Unable to write the output on file "
                                            + configuration.getConditionTranslatorOutput().getAbsolutePath(),
                                    e);
                        }
                    }
                } else if (configuration.mustGenerateTPs()) {
//                && !temporalProtocols.isEmpty()) {
                    // Temporal protocols goal output
//          if (configuration.getConditionTranslatorOutput() != null) {
                    try (BufferedWriter writer =
                                 Files.newBufferedWriter(
                                         configuration.getConditionTranslatorOutput().toPath(),
                                         StandardCharsets.UTF_8)) {
                        Collection<ProtocolSpecification> protocols = temporalProtocols.values();
//              if (!protocols.isEmpty()) {
                        for (DocumentedExecutable executable : members) {
                            jsonOutputs.add(new JsonOutput(executable, temporalProtocols.get(executable)));
                        }
                        String jsonOutput = GsonInstance.gson().toJson(jsonOutputs);
                        writer.write(jsonOutput);
//              } else {
//                // FIXME ugly, but we don't want empty JSON files around for now
//                File file = new File(configuration.getConditionTranslatorOutput().toURI());
//                file.delete();
//              }
                    } catch (Exception e) {
                        log.error(
                                "Unable to write the output on file "
                                        + configuration.getConditionTranslatorOutput().getAbsolutePath(),
                                e);
                    }
//          }
                } else if (!specifications.isEmpty()) {
                    if (configuration.getConditionTranslatorOutput() != null) {
                        try (BufferedWriter writer =
                                     Files.newBufferedWriter(
                                             configuration.getConditionTranslatorOutput().toPath(),
                                             StandardCharsets.UTF_8)) {

                            for (DocumentedExecutable executable : specifications.keySet()) {
                                jsonOutputs.add(new JsonOutput(executable, specifications.get(executable)));
                            }
                            String jsonOutput = GsonInstance.gson().toJson(jsonOutputs);
                            writer.write(jsonOutput);
                        } catch (Exception e) {
                            log.error(
                                    "Unable to write the output on file "
                                            + configuration.getConditionTranslatorOutput().getAbsolutePath(),
                                    e);
                        }
                    } else {
                        for (DocumentedExecutable member : members) {
                            jsonOutputs.add(new JsonOutput(member, specifications.get(member)));
                        }
                        String jsonOutput = GsonInstance.gson().toJson(jsonOutputs);
                        System.out.println("Condition translator output:\n" + jsonOutput);
                    }
                }
            }
            // Create statistics.
            createStatistics(jsonOutputs);

            // FIXME Randoop specs do not work for eq currently
            // Export generated specifications as Randoop specifications if requested.
            // generateRandoopSpecs(specifications);

            // === Oracle Generator ===
            // Note that aspect generation is enabled only when translation is enabled.
            if (configuration.isOracleGenerationEnabled()) {
                if (configuration.mustGenerateCrossOracles()) {
                    try {
                        OracleGenerator.createAspects(eqSpecifications);
                    } catch (IOException e) {
                        e.printStackTrace();
                        log.error("Error during aspects creation.", e);
                    }
                } else {
                    try {
                        OracleGenerator.createAspects(specifications);
                    } catch (IOException e) {
                        e.printStackTrace();
                        log.error("Error during aspects creation.", e);
                    }
                }
            } else {
                log.info("Oracle generator disabled: aspect generation skipped.");
            }
        }
    }

    private static void createStatistics(List<JsonOutput> translatorJsonOutputs) {
        File expectedResultFile = configuration.getExpectedOutput();
        if (expectedResultFile != null) {
            Type collectionType = new TypeToken<List<JsonOutput>>() {
            }.getType();
            try (BufferedReader reader = Files.newBufferedReader(expectedResultFile.toPath());
                 BufferedWriter resultsFile =
                         Files.newBufferedWriter(
                                 configuration.getStatsFile().toPath(),
                                 StandardOpenOption.CREATE,
                                 StandardOpenOption.APPEND)) {

                List<JsonOutput> expectedResultList = GsonInstance.gson().fromJson(reader, collectionType);
                Map<String, JsonOutput> expectedMap = new HashMap<>();
                Map<String, JsonOutput> actualMap = new HashMap<>();
                for (JsonOutput jo : expectedResultList) {
                    expectedMap.put(jo.signature, jo);
                }
                for (JsonOutput jo : translatorJsonOutputs) {
                    actualMap.put(jo.signature, jo);
                }

                List<Stats> targetClassResults = null;
                if (!translatorJsonOutputs.isEmpty()) {
                    targetClassResults = Stats.getEqStats(actualMap, expectedMap);
                } else if (!configuration.mustGenerateCrossOracles()) {
                    targetClassResults = Stats.getStats(translatorJsonOutputs, expectedResultList);
                }
                if (targetClassResults != null) {
                    for (Stats result : targetClassResults) {
                        if (result.numberOfConditions() != 0) { // Ignore methods with no tags.
                            resultsFile.write(result.asCSV());
                            resultsFile.newLine();
                        }
                    }
                }
            } catch (IOException e) {
                log.error("Unable to read the file: " + configuration.getConditionTranslatorInput(), e);
            }
        }
    }

    /**
     * Export the specifications in {@code specsMap} to {@code conf.Configuration#randoopSpecsFile()}
     * as Randoop specifications.
     *
     * @param specsMap the documented methods containing the specifications to export
     */
    private static void generateRandoopSpecs(
            Map<DocumentedExecutable, OperationSpecification> specsMap) {
        File randoopSpecsFile = configuration.randoopSpecsFile();
        if (!configuration.isSilent() && randoopSpecsFile != null) {
            generateRandoopSpecsFile(randoopSpecsFile);
            Collection<OperationSpecification> randoopSpecs = new ArrayList<>();
            for (DocumentedExecutable documentedExecutable : specsMap.keySet()) {
                final OperationSpecification spec = specsMap.get(documentedExecutable);

                // Get rid of empty specifications.
                final List<Precondition> preSpecifications = spec.getPreconditions();
                preSpecifications.removeIf(s -> s.getGuard().getConditionSource().isEmpty());
                final List<Postcondition> postSpecifications = spec.getPostconditions();
                postSpecifications.removeIf(s -> s.getGuard().getConditionSource().isEmpty());
                final List<ThrowsCondition> throwsSpecifications = spec.getThrowsConditions();
                throwsSpecifications.removeIf(s -> s.getGuard().getConditionSource().isEmpty());
                if (spec.isEmpty()
                        || (preSpecifications.isEmpty()
                        && postSpecifications.isEmpty()
                        && throwsSpecifications.isEmpty())) {
                    continue;
                }

                // Convert specifications to Randoop format: args -> actual param name.
                final List<Precondition> randoopPreSpecs =
                        convertPreSpecifications(documentedExecutable, preSpecifications);
                final List<Postcondition> randoopPostSpecs =
                        convertPostSpecifications(documentedExecutable, postSpecifications);
                final List<ThrowsCondition> randoopThrowsSpecs =
                        convertThrowsSpecifications(documentedExecutable, throwsSpecifications);

                final OperationSpecification newOperationSpec =
                        new OperationSpecification(
                                spec.getOperation(),
                                spec.getIdentifiers(),
                                randoopPreSpecs,
                                randoopPostSpecs,
                                randoopThrowsSpecs);
                randoopSpecs.add(newOperationSpec);
            }
            writeRandoopSpecsFile(randoopSpecsFile, randoopSpecs);
        }
    }

    private static List<Precondition> convertPreSpecifications(
            DocumentedExecutable documentedExecutable, List<Precondition> preSpecifications) {
        List<Precondition> newPreSpecifications = new ArrayList<>(preSpecifications.size());
        for (Precondition preSpecification : preSpecifications) {
            final Guard oldGuard = preSpecification.getGuard();
            Guard newGuard =
                    new Guard(
                            oldGuard.getDescription(),
                            processCondition(oldGuard.getConditionSource(), documentedExecutable));
            Precondition newSpec = new Precondition(preSpecification.getDescription(), newGuard);
            newPreSpecifications.add(newSpec);
        }
        return newPreSpecifications;
    }

    private static List<ThrowsCondition> convertThrowsSpecifications(
            DocumentedExecutable documentedExecutable, List<ThrowsCondition> throwsSpecifications) {
        List<ThrowsCondition> newThrowsSpecifications = new ArrayList<>(throwsSpecifications.size());
        for (ThrowsCondition throwsSpecification : throwsSpecifications) {
            final Guard oldGuard = throwsSpecification.getGuard();
            Guard newGuard =
                    new Guard(
                            oldGuard.getDescription(),
                            processCondition(oldGuard.getConditionSource(), documentedExecutable));
            ThrowsCondition newSpec =
                    new ThrowsCondition(
                            throwsSpecification.getDescription(),
                            newGuard,
                            throwsSpecification.getExceptionTypeName());
            newThrowsSpecifications.add(newSpec);
        }
        return newThrowsSpecifications;
    }

    private static List<Postcondition> convertPostSpecifications(
            DocumentedExecutable documentedExecutable, List<Postcondition> postSpecifications) {
        List<Postcondition> newPostSpecifications = new ArrayList<>(postSpecifications.size());
        for (Postcondition postSpec : postSpecifications) {
            final Guard oldGuard = postSpec.getGuard();
            Guard newGuard =
                    new Guard(
                            oldGuard.getDescription(),
                            processCondition(oldGuard.getConditionSource(), documentedExecutable));
            final Property oldProperty = postSpec.getProperty();
            Property newProperty =
                    new Property(
                            oldProperty.getDescription(),
                            processCondition(oldProperty.getConditionSource(), documentedExecutable));
            Postcondition newSpec = new Postcondition(postSpec.getDescription(), newGuard, newProperty);
            newPostSpecifications.add(newSpec);
        }
        return newPostSpecifications;
    }

    private static void writeRandoopSpecsFile(
            File randoopSpecsFile, Collection<OperationSpecification> specs) {
        try (BufferedWriter writer =
                     Files.newBufferedWriter(
                             randoopSpecsFile.toPath(),
                             StandardOpenOption.WRITE,
                             StandardOpenOption.TRUNCATE_EXISTING,
                             StandardOpenOption.CREATE)) {
            writer.write(GsonInstance.gson().toJson(specs));
        } catch (IOException e) {
            log.error(
                    "Error occurred during the export of generated specifications to file "
                            + randoopSpecsFile.getPath(),
                    e);
        }
    }

    private static void generateRandoopSpecsFile(File randoopSpecsFile) {
        if (!randoopSpecsFile.exists()) {
            try {
                File parentDir = randoopSpecsFile.getParentFile();
                if (parentDir != null) {
                    Files.createDirectories(parentDir.toPath());
                }

            } catch (IOException e) {
                log.error("Error occurred during creation of the file " + randoopSpecsFile.getPath(), e);
            }
        }
    }
}

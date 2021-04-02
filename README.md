# MeMo

MeMo is an approach to automatically identify metamorphic relations inside natural language, unstructured code comments. 
The identified MRs are automatically translated into executable test oracles that can be weaved into existing test suites.
As of now the prototype works on Javadoc method summaries, and thus produces Java assertions.

### Releases
Please find the latest working executable under <a href=https://github.com/ariannab/MeMo/releases> the releases page</a>.

If you wish to produce an executable yourself, clone this repo and launch `./gradlew shadowJar`. 

### Prerequisites
Please notice that both the Gradle wrapper and the Major tool needed for the analysis explained in the next section may show inconsistent behaviour with
Java 9+. Until a workaround for such issues is not found, you are advised to get a Java 8 release before running any experiment with MeMo (e.g., <a href=https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html> here</a>)

### Translations
Under <a href=https://github.com/ariannab/MeMo/tree/master/expected-equivalences>this folder</a> you find the ground truth. You may check the files for each project class manually. The format looks like:  
```
expected-equivalences/<project-identifier>/<fully-qualified-class-name>_goal.json
```

Each first-level object is the representation of a method of the class. Inside each method, look for `"equivalence"` objects: if attribute `"condition"` is non-empty, that is the translation it is expected by MeMo for such method and comment.


> <b>Example</b>. To check class `org.apache.commons.math3.geometry.euclidean.threed.FieldRotation` of Apache Commons Math, <a href=https://github.com/ariannab/MeMo/blob/master/expected-equivalences/math/org.apache.commons.math3.geometry.euclidean.threed.FieldRotation_goal.json>reach the corresponding file</a>. 
> <p>You will find an expected translation for method applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> r).


To verify MeMo performances on such dataset, clone this repo and launch `./gradlew accuracyEQ`, which will show the translations produced on the present ground truth. For each method of each class, MeMo may produce exactly the translation written in the file (`Correct`), a non-empty translation that differs from the expected one (`Wrong`), an empty translation when condition is not empty (`Missing`), or a non-empty translation when no condition was expected (`Spurious`).

### Mutation analysis experiments
Please go to <a href=https://gitlab.software.imdea.org/arianna.blasi/memo-experiments-2021>this repository</a> for complete instructions on how to reproduce the Mutation analysis results. These experiments practically show how MeMo assertions can detect bugs.

## Troubleshooting
If you encounter any problem, please <a href=https://github.com/ariannab/MeMo/issues/new>open an issue</a> or contact the main developer at blasia@usi.ch

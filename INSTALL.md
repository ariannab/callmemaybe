
## Prerequisites
We use gradle to compile the sources, build the executables, and run the accuracy results. We require a Java 8 release in order to run anything for CallMeMaybe involving gradle (e.g., <a href=https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html> here</a>). 
The commands specified in this guide have been tested on macOS.

Once you know the location of your Java 8 installation, it is useful to set the environment variables in the same terminal where you will run the subsequent commands. This is an example for macOS:

```
export PATH=/Library/Java/JavaVirtualMachines/jdk1.8.<some-version-here>.jdk/Contents/Home/bin:$PATH
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8<some-version-here>.jdk/Contents/Home/
```
*Note: follow Translation Accuracy first and then Randoop+CMM experiments, as the latter uses resources retrieved in the former*

## Translation Accuracy (RQ1)

To verify the accuracy results performances on our dataset, be sure to follow the Prerequisites first. In the same terminal, then:
- clone this repo 
- `cd` to the relative folder
- launch  `./gradlew build` 

This whole process may take up to 15 minutes as it will download all the relevant resources, build the same executable you find as release, and already execute the accuracy results (which are in the form of tests). Another way to reproduce only the results, although without skipping `build` as we need the resources, is to launch `./gradlew accuracy -i`.

### How to inspect the results output

- You should already see in the standard output of the terminal the results produced on our ground truth. 
- Alternatively, gradle should show you a link where to inspect its test reports in a browser, something like: `file:///Users/<user-name>/<cmm-repo-name>/build/reports/tests/test/packages/org.callmemaybe.accuracy.protocols.html`. 
- Finally, an equivalent alternative to get these results is to clone this repo and open the project in a IDE (such as IntelliJ or Eclipse), and run all the test under folder `java/org/callmemaybe/accuracy/protocols`.

### How to interpret the results output
For each method of each class, CallMeMaybe may produce exactly the translation expected in the ground truth file (`Correct`), a non-empty translation that differs from the expected one (`Wrong`), an empty translation when the expected condition is not empty (`Missing`), or a non-empty translation when no condition was expected at all (`Spurious`). 
This is an example of output for class `java.util.HashSet`:
```
=== Test java.util.HashSet ===
    Correct FreeTextcondition for method: clear()
    CommentContent: Removes all of the elements from this set. The set will be empty after this call returns. 
        Expected condition: receiverObjectID.isEmpty()<-receiverObjectID.clear()
        Actual condition: receiverObjectID.isEmpty()<-receiverObjectID.clear()
```


## Randoop+CMM experiments (RQ2)
Our [release](https://github.com/ariannab/callmemaybe/releases/tag/ASE22) already contains our modified version on Randoop. You can look up its sources  [under this branch](https://github.com/ariannab/randoop/tree/cmm-checks).

Under [this folder](https://github.com/ariannab/callmemaybe/tree/master/ase-22-experiments) we provide how the expected results should look like. To reproduce them:

- open a terminal in `ase-22-experiments/repro`
- launch `./repro.sh` (NOTE: it uses `curl` to download our release, if this doesn't work for your OS, please download CMM and Randoop executable from our release manually and move them to the generated `libs` folder)
- move into the individual projects subdirs (`jdk8` and `collections4`) and launch the respective `./feed-randoop-with-cmm` scripts to reproduce all experiments

### How to inspect the results output
You find all the CMM comments inside Randoop tests: for a given class of either project, look into `specs-dir-<classname>/randoop-tests`. 

When exceptions are confirmed in Regression Tests: 
```
// Expected exception.
/* And violated CMM Protocol confirms this too: [...]
```
When errors are deemed as false positives in Error Test:
```
/* during test generation this statement threw an exception of type java.lang.NullPointerException in error
but CMM Protocol violated too: [...]
```

You easily gep them all for example launching `grep -i "cmm" *`.




*Notice that there is an additional script, `get_evaluation_project_subjects.bash`, to download all of our CallMeMaybe subjects in case you were not able to run gradle (for CMM+Randoop, you only need commons collections and the JDK).*

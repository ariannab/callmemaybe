### Translation Accuracy (RQ1)

To verify the accuracy results performances on our dataset, clone this repo and launch `../gradlew accuracy`, which will show the translations produced on our ground truth. For each method of each class, CallMeMaybe may produce exactly the translation written in the file (`Correct`), a non-empty translation that differs from the expected one (`Wrong`), an empty translation when condition is not empty (`Missing`), or a non-empty translation when no condition was expected (`Spurious`).

An equivalent alternative to get these results is to clone this repo and open the project in a IDE (such as IntelliJ or Eclipse), and run all the test under folder `java/org/callmemaybe/accuracy/protocols`.

### Randoop+CMM experiments (RQ2)
Our [release](https://github.com/ariannab/callmemaybe/releases/tag/ASE22) already contains our modified version on Randoop. You can look up its sources  [under this branch](https://github.com/ariannab/randoop/tree/cmm-checks).

Under [this folder](https://github.com/ariannab/callmemaybe/tree/master/ase-22-experiments) we provide how the expected results should look like. To reproduce them, you must launch the .sh (bash) scripts for both projects. Please adjust the paths (project sources and such) as it is convenient for you.

Notice that there is an additional script, `get_evaluation_project_subjects.bash`, to download all of our CallMeMaybe subjects in case you were not able to run gradle (for CMM+Randoop, you only need commons collections and the JDK).

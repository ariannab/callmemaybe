# CallMeMaybe

CallMeMaybe uses natural language processing to analyze Javadoc comments to identify temporal properties. This information can guide a test case
generator towards executing sequences of method calls that respect the temporal properties.

### Releases

You find the first official release [here](https://github.com/ariannab/callmemaybe/releases/tag/ASE22). It includes both the CallMeMaybe executable and the randoop executable.

### Prerequisites
We use gradle to compile the sources, build the executables, and run the accuracy results. However, we witnessed some inconsistent behaviour with Gradle and Java 9+. Until a workaround for such issues is not found, you are advised to get a Java 8 release before running anything for CallMeMaybe involving gradle (e.g., <a href=https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html> here</a>)

### Translations
Under <a href=https://github.com/ariannab/callmemaybe/tree/master/expected-tp>this folder</a> you find our ground truth for the temporal constraints/call protocols. You may check the files for each project class manually. The format looks like:  
```
expected-tp/<project-identifier>/<fully-qualified-class-name>_goal.json
```

Each first-level object is the representation of a method of the class. Inside each method, look for `"protocol"` objects: if attribute `"condition"` is non-empty, that is the translation it is expected by CallMeMaybe for such method and comment.


> <b>Example</b>. To check class `org.apache.commons.collections4.iterators.TransformIterator` of Apache Commons Collections, <a href=https://github.com/ariannab/callmemaybe/blob/master/expected-tp/collections4/org.apache.commons.collections4.iterators.TransformIterator_goal.json>reach the corresponding file</a>. 
> <p>You will find an expected translation for the contructor `org.apache.commons.collections4.iterators.TransformIterator()`.


### Replication 

See [INSTALL file](https://github.com/ariannab/callmemaybe/blob/master/INSTALL.md) .

# Script to:
# 1. Generate CMM specs
# 2. Automatically generate tests with RANDOOP
# 3. Check if CMM was triggered in ErrorTests?
# Input: SEED FOR TS GENERATION. If not provided, default will be 0.

if [ -z "$1" ] 
then 
   # default the seed if not provided
   set -- 0
    echo -e "No seed was provided, by default it will be set to $1 [zero]"
else
    echo -e "Generating tests with seed set as $1"
fi

# The following you can leave as costants unless you change something in the file system
specsDir="specs-dir"
randpTestDir="randoop-tests"
randoopJar="randoop-all-4.3.0.jar"
cmmJar="CallMeMaybe-1.0-all.jar"

# THE FOLLOWING YOU MUST CHANGE according to project, as well as the content of classlist.txt
srcFolder="jdk8-sources/src/share/classes"
jarFile="jdk8-2.9.0.jar"

echo "Batch generation of RANDOOP tests"

# We need Java 8 for this prototype, some tools involved do not work correctly with subsequent versions.
export PATH=/Library/Java/JavaVirtualMachines/jdk1.8.0_172.jdk/Contents/Home/bin:$PATH

# Reading class list file, one class per line at a time for which we generate Aspects and tests
while read classFile <&3; do   
    targetClass=$classFile

    specsDirName=$(echo $targetClass | rev | cut -d'.' -f 1 | rev)

    echo -e "\n+++++++++++ $specsDirName +++++++++++"

    # Generate CMM specs on target class. 
    java -jar ../libs/$cmmJar --target-class $targetClass  --source-dir $srcFolder --class-dir $jarFile --disable-semantics true --condition-translator-output $targetClass"_goal.json" --temp-protocols true --randoop-CMM-output $targetClass"_cmmRandoop.json"


    mkdir "$specsDir-$specsDirName/$randpTestDir"

    # Randoop tests, fed with CMM specs. They are outputted in randoop-tests. --time-limit default is 100.
    java -classpath ../libs/$randoopJar:../libs/$jarFile randoop.main.Main gentests --randomseed=$1 --testclass=$targetClass --junit-output-dir=./$specsDir-$specsDirName/$randpTestDir/ --use-jdk-specifications=false --cmm-temporal-specs=$targetClass"_cmmRandoop.json"
    
done 3<classlist-pres.txt
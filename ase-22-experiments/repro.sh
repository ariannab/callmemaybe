#!/bin/bash

# Script to set up a proper repro folder.

srcFolderJdk="jdk8-sources/src/share/classes"
jarFileJdk="jdk8-2.9.0.jar"

srcFolderColl="jdk8-sources/src/share/classes"
jarFileColl="jdk8-2.9.0.jar"

cmmRelease="https://github.com/ariannab/callmemaybe/releases/download/ASE22-final/CallMeMaybe-1.0-all.jar"
randoopRelease="https://github.com/ariannab/callmemaybe/releases/download/ASE22-final/randoop-all-4.3.0.jar"

resourcesBaseDir="../../../src/test/resources"

echo "Setting up repro/ folder..."
mkdir repro
cd repro


echo -e "\nInto repro/, setting up libs folder with our release executables..."
mkdir libs
cd libs
curl -LO -o CallMeMaybe-1.0-all.jar ${cmmRelease}
curl -LO -o randoop-all-4.3.0.jar ${randoopRelease}
cd ..

echo -e "\nInto repro/, setting up JDK and Collections folder..."
mkdir jdk8
mkdir collections4

echo -e "\nInto JDK folder, setting up resources..."
cd jdk8
cp -r $resourcesBaseDir/src/jdk8-sources/ jdk8-sources/
cp $resourcesBaseDir/bin/jdk8-2.9.0.jar .

echo -e "\nInto Collections folder, setting up resources..."
cd ../collections4
cp -r $resourcesBaseDir/src/commons-collections4-4.1-src commons-collections4-4.1-src/
cp $resourcesBaseDir/bin/commons-collections4-4.1.jar .
cd ..

echo -e "\nMoving generation scripts in respective folders..."
mv ../feed-randoop-with-cmm-jdk.sh jdk8/
mv ../feed-randoop-with-cmm-coll.sh collections4/


echo -e "\nDone! Move to the repro/ folder."
echo -e "Into individual project subdirectories, launch the feed-randoop-with-cmm scripts to execute experiments and inspect results"
#!/bin/bash

# Script to set up a proper repro folder.

srcFolderJdk="jdk8-sources/src/share/classes"
jarFileJdk="jdk8-2.9.0.jar"

srcFolderColl="jdk8-sources/src/share/classes"
jarFileColl="jdk8-2.9.0.jar"

cmmRelease="https://github.com/ariannab/callmemaybe/releases/download/ASE22-final/CallMeMaybe-1.0-all.jar"
randoopRelease="https://github.com/ariannab/callmemaybe/releases/download/ASE22-final/randoop-all-4.3.0.jar"

echo "Setting up repro folder..."
mkdir repro
cd repro


echo -e "\nInto repro, set up libs folder with our release executables"
mkdir libs
cd libs
# curl -LO -o CallMeMaybe-1.0-all.jar ${cmmRelease}
# curl -LO -o randoop-all-4.3.0.jar ${randoopRelease}
cd ..

echo -e "\nInto repro, set up JDK and Collections folder"
mkdir jdk8
mkdir collections4

echo -e "\nInto JDK folder, set up resources"
cd jdk8
cp -r ../../src/test/resources/src/jdk8-sources/ jdk8-sources/
cp ../../src/test/resources/bin/jdk8-2.9.0.jar .

echo -e "\nInto Collections folder, set up resources"
cd ../collections4
cp -r ../../src/test/resources/src/commons-collections4-4.1-src commons-collections4-4.1-src/
cp ../../src/test/resources/bin/commons-collections4-4.1.jar .


echo -e "\nMoving generation scripts in respective folders..."
mv feed-randoop-with-cmm-jdk.sh jdk8/
mv feed-randoop-with-cmm-coll.sh collections4/


echo -e "\nDone! Move to the individual project folders and launch the feed-randoop-with-cmm scripts to launch experiments and inspect results"
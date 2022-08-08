#!/bin/bash

##############################################################

# this script downloads the original sources and binaries of the projects we analyzed

##############################################################

PROJECTS_SRC_ZIP=("commons-collections4-4.1-src.zip"  \
  "guava-19.0-sources.jar" \
  "gs-core-1.3-sources.jar" \
               "weka-stable-3.8.0-sources.jar" \
               "jdk8-sources.zip" \
               "colt-master.zip" 
               "lucene-core-7.2.1-sources.jar")

PROJECTS_SRC_NAMES=("commons-collections4-4.1-src"  \
  "guava-19.0-sources" \
  "gs-core-1.3-sources" \
               "weka-stable-3.8.0-sources" \
               "jdk8-sources" \
               "colt-master" 
               "lucene-core-7.2.1-sources")

PROJECTS_SRC_URL=('https://archive.apache.org/dist/commons/collections/source/commons-collections4-4.1-src.zip' \
    'https://repo1.maven.org/maven2/com/google/guava/guava/19.0/guava-19.0-sources.jar' \
    'https://repo1.maven.org/maven2/org/graphstream/gs-core/1.3/gs-core-1.3-sources.jar'\
    'https://repo1.maven.org/maven2/nz/ac/waikato/cms/weka/weka-stable/3.8.0/weka-stable-3.8.0-sources.jar' \
    'https://star-rep.inf.usi.ch/arianna_blasi/jdk8-resources/raw/master/jdk8-sources.zip' \
    'https://github.com/kzn/colt/archive/refs/heads/master.zip' \
    'https://repo1.maven.org/maven2/org/apache/lucene/lucene-core/7.2.1/lucene-core-7.2.1-sources.jar')


mkdir -p "../src/test/resources/src"
cd "../src/test/resources/src"
# rm -rf *

##############################################################

for (( i = 0; i < 7; i++ )); do

  P_NAME=${PROJECTS_SRC_NAMES[$i]}
  P_ZIP=${PROJECTS_SRC_ZIP[$i]}
  P_URL=${PROJECTS_SRC_URL[$i]}

  echo "getting projects source ${P_NAME}"

  echo "..downloading"
  curl -LO -o ${P_ZIP} ${P_URL}

  echo "..extracting sources"
  if [[ ${P_ZIP} == *.jar ]] 
  then
    unzip -qq -d ${P_NAME} ${P_ZIP}
  else
    unzip -qq ${P_ZIP}
  fi

done

##############################################################

mkdir "../bin"
cd "../bin"
# rm -rf *

##############################################################

PROJECTS_BIN_URL=('https://repo1.maven.org/maven2/org/apache/commons/commons-collections4/4.1/commons-collections4-4.1.jar' \
  'https://repo1.maven.org/maven2/com/google/guava/guava/19.0/guava-19.0.jar' \
  'https://repo1.maven.org/maven2/org/graphstream/gs-core/1.3/gs-core-1.3.jar' \
  'https://repo1.maven.org/maven2/nz/ac/waikato/cms/weka/weka-stable/3.8.0/weka-stable-3.8.0.jar'\
  'https://star-rep.inf.usi.ch/arianna_blasi/jdk8-resources/raw/master/jdk8-2.9.0.jar' \
  'https://repo1.maven.org/maven2/colt/colt/1.2.0/colt-1.2.0.jar'\
  'https://repo1.maven.org/maven2/org/apache/lucene/lucene-core/7.2.1/lucene-core-7.2.1.jar'
  )

PROJECTS_BIN_NAMES=("commons-collections4-4.1.jar"  \
  "guava-19.0.jar" \
  "gs-core-1.3.jar" \
               "weka-stable-3.8.0.jar" \
               "jdk8-2.9.0.jar" \
               "colt-1.2.0.jar" 
               "lucene-core-7.2.1.jar")
##############################################################

for (( i = 0; i < 7; i++ )); do
  P_URL=${PROJECTS_BIN_URL[$i]}
  P_NAME=${PROJECTS_BIN_NAMES[$i]}

  echo "getting projects binaries"

  echo "..downloading"
  curl -o ${P_NAME} ${P_URL}

done

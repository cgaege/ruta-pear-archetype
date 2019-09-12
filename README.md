# ruta-pear-archetype [![Build Status](https://travis-ci.com/averbis/ruta-pear-archetype.svg?branch=master)](https://travis-ci.com/averbis/ruta-pear-archetype) ![](https://img.shields.io/maven-central/v/de.averbis.textanalysis/ruta-pear-archetype.svg?style=flat)


Project template to bootstrap UIMA Ruta annotators and package them as a PEAR package. 

## Prerequisites

- JDK 1.8 or later
- Maven

## Generate a new Ruta Annotator Project
New Ruta annotator projects with PEAR packaging can be generated with the following maven command:

```
mvn archetype:generate -DarchetypeGroupId=de.averbis.textanalysis -DarchetypeArtifactId=ruta-pear-archetype -DarchetypeVersion=1.2.0
```
You need to define a [groupId, artifactId and version](https://maven.apache.org/guides/mini/guide-naming-conventions.html) for your UIMA Ruta annotator project. 

1. Specify a `groupId` for the project. It must follow [Java's package name rules](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html).
```
Define value for property 'groupId': com.example
```

2. Define an `artifactId` for the project. It should consist of lowercase letters and must not contain special characters or dots.
```
Define value for property 'artifactId': my-ruta-annotator
```

3. Define a `version` for your Ruta annotator. 
```
Define value for property 'version' 1.0-SNAPSHOT: 1.0
```

4. Define a `package` for your Ruta annotator. It must follow [Java's package name rules](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html).
```
Define value for property 'package': com.example.nlp
```

5. Define a `rutaScriptName` for your Ruta annotator. It should always begin with a capital letter and must not contain any special characters or space characters. If there are multiple words in the `rutaScriptName`, then each word should start with a capital letter. 
```
Define value for property 'rutaScriptName' Myrutaannotator: MyAnnotator
```

6. Review and confirm the Ruta annotator configuration:

```
Confirm properties configuration:
groupId: com.example
artifactId: my-ruta-annotator
version: 1.0
package: com.example.nlp
rutaScriptName: MyAnnotator
 Y: : y
```

This will generate a Ruta annotator project structure within the `my-ruta-annotator` directory:

```
my-ruta-annotator/
├── pom.xml
└── src
    ├── main
    │   ├── resources
    │   │   └── META-INF
    │   │       └── org.apache.uima.fit
    │   │           └── types.txt
    │   └── ruta
    │       └── com
    │           └── example
    │               └── nlp
    │                   └── MyRutaAnnotator.ruta
    └── test
        └── java
            └── com
                └── example
                    └── nlp
                        └── PearPackageIT.java
```


## Build the generated Ruta Annotator Project

Navigate into the project directory:
```
cd my-ruta-annotator
```
Build the Ruta annotator project with maven:
```
mvn clean install
```
This will assemble a PEAR package in the target directory.

```
target/my-ruta-annotator-1.0.pear
```

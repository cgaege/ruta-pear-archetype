# ruta-pear-archetype [![Build Status](https://travis-ci.com/cgaege/ruta-pear-archetype.svg?branch=master)](https://travis-ci.com/cgaege/ruta-pear-archetype)

Project template to bootstrap UIMA Ruta annotators and package them as a PEAR package. 

## Prerequisites

- JDK 1.8 or later
- Maven

## Generate a new Ruta Annotator Project
New Ruta annotator projects with PEAR packaging can be generated like this:

```
mvn archetype:generate -DarchetypeGroupId=de.averbis.textanalysis -DarchetypeArtifactId=ruta-pear-archetype -DarchetypeVersion=0.2.0-RC1
```
You need to define a groupId, artifactId and version for your UIMA Ruta annotator project. See https://maven.apache.org/guides/mini/guide-naming-conventions.html for further details.


Define a `groupId` for your Ruta annotator. A `groupId` must follow Java's package name rules. 
```
Define value for property 'groupId': com.example
```

Define an `artifactId` for your Ruta annotator. The `artifactId` must not contain special characters or dots.
```
Define value for property 'artifactId': my-ruta-annotator
```

Define a `version` for your Ruta annotator. 
```
Define value for property 'version': 1.0.0-SNAPSHOT
```

Define a `package` for your Ruta annotator:
```
Define value for property 'package': com.example.nlp
```

Review and confirm the Ruta annotator configuration:

```
Confirm properties configuration:
groupId: com.example
artifactId: my-ruta-annotator
version: 1.0.0-SNAPSHOT
package: com.example.nlp
 Y: : y
```

This will generate a Ruta annotator project structure within the `my-ruta-annotator` directory.

## Build the generated Ruta Annotator Project

Navigate into the project directory:
```
cd my-ruta-annotator
```
Build the Ruta annotator project with maven:
```
mvn clean install
```
This will assemble a `my-ruta-annotator-1.0.0-SNAPSHOT.pear` package in the target directory.

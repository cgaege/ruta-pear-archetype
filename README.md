# ruta-pear-archetype [![Build Status](https://travis-ci.com/cgaege/ruta-pear-archetype.svg?branch=master)](https://travis-ci.com/cgaege/ruta-pear-archetype)

Maven archetype to scaffold UIMA Ruta annotators and package them as a PEAR package. 

## Build prerequisites

- JDK 1.8 or later
- Maven

## Build instructions
New Ruta annotator projects with PEAR packaging can be created like this:

```
mvn archetype:generate -DarchetypeGroupId=de.averbis.textanalysis -DarchetypeArtifactId=ruta-pear-archetype -DarchetypeVersion=0.2.0-SNAPSHOT
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

This will generate a Ruta annotator project structure within the `my-ruta-annotator` directory. The project can be built using the following command:
```
cd my-ruta-annotator
mvn clean install
```

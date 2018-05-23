# Spark-QueryDSL-Thymeleaf Demo

This is a demonstration of the use of QueryDSL code generation plus the Spark Java webapp framework to generate tiny database-accessing web applications with minimal code. 

*Please note that the structure of this codebase is not optimal for anything other than a demo.*

## Build process

In order to build the application ready for running from the commandline, run:

```
mvn clean package
```

## Running the application

Run the resulting JAR (ending with "jar-with-dependencies") as follows:

```
java -jar {jar file}

Eg: java -jar target/spark-querydsl-thymeleaf-demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

## Accessing the running applications

By default the web application is available on [http://localhost:4567/index.html](http://localhost:4567/index.html)
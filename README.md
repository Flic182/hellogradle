# HelloWorld Gradle & JBehave Demonstration

## About
This is a simple HelloWorld project that demonstrates how to set up a small
Gradle project with JBehave tests (on JUnit5).  It also uses Lombok.

## Execution
Build the program from the root of the project with
`gradlew clean build testClasses --info`.  You may wish to add the `javadoc`
task (between `testClasses` and `--info`) to generate Javadocs.

Javadocs are written to `build/docs/javadoc` and test scenario reports to
`build/reports/jbehave/view`.

***Note:**  Scenario results will only be printed to
the console when the* `--info` *flag is used.*

## Things to watch
Pay careful attention to how the Gradle Lombok & Javadoc plugins are configured.
Javadocs will not be generated properly without de-lomboking the source and
running Javadoc against the de-lomboked code.  If the default output directory
is used for the `delombok` goal, your IDE may complain about duplicated classes.

The program can be run from the root of the project with `gradlew clean build`.
Story files are expected to live under `test/resources`.

# pin-batch-generator

Prerequisite =>
---------------
- JDK - 1.17.x
- Maven - 3.9.x

Steps to run =>
---------------
- build - mvn clean compile
- run tests - mvn test
- surefire report - mvn surefire:test

Limitations =>
---------------
- Library assures 1000 unique pins in each batch. If it is executed for X number of times to get (1000 * X) pins, certainly there will be duplicates.



# Maven

- Maven is software project management tool, Based on Project Object mode (POM) Maven can Manage Project build, reporting and documentation from central piece of information.
- Maven follows Convention over configuration.
  - Predefined folder structure
  - Almost all java Projects follow Maven Structure (Consistency)
- Maven Central repository Contains Jars
  - On top of central repository we can add Additional repositories for dependencies and plugins.
    ```<repositories> <repository></repository></repositories>```
    ```<pluginRepositories><pluginRepository></pluginRepository></pluginRepositories>```
- Downloaded dependencies are stored in local Maven Repo

- Things maven can do:
  - Creating new Projects
  - Manage dependencies and their versions
  - Build a JAR file
  - Run you application locally in Tomcat or Jetty.
  - Run unit tests
  - Deploy to test environment and lot more


### POM [Project object model]
- POM.XML --> Tags in pom.xml
  1.  **Dependencies:**
      - First thing defined in POM is Maven dependencies i.e Frameworks and Libraries used in the project 
        we can define multiple Dependencies as below
      - Dependencies that are defined in pom can have other dependencies defined and those are called **Transitive dependencies**.
- ````
    <dependencies>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.2.220</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    ````
  2. **Parent Pom:** 
     - Versions of Dependencies are defined in dependency management or parent pom, if no version is defined it will select version from parent pom.
  3. **Name of Project:**
     - GroupID [Similar to package name] + Artifact ID [Similar to class Name]

### Maven Build Life Cycle
- Maven build lifecycle is sequence of the below steps.
  - Validate
  - Compile
  - Test
  - Package
  - Integration Test
  - Verify
  - Install
  - Deploy

### Maven Commands
- Any of the below commands will run the steps above its sequence in the build lifecycle. For example **mvn test** will complete validate and compile.
  - mvn --version
  - mvn compile  [Only source files are compiled]
  - mvn test-compile [Source and test files are compiled]
  - mvn clean [this will clean entire target folder]
  - mvn test [to run unit test]
  - mvn package
  - mvn help:effective-pom
  - mvn dependency:tree
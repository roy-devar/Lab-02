# Lab-2

# Project Setup Instructions

## Step 1: Create File Structure
Run the following command to create the Maven project structure:
```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Step 2: Edit Project Structure
After the project is generated, make the necessary edits. You can ignore the `target` folder, as it will be created automatically after compilation.

## Step 3: Add Files from Lab 1
Download the **Lab.zip** file, then extract it into your codespace using this command:
```bash
unzip Lab.zip
```

## Step 4: Move Files into `main/java` Folder
Move all files from the `c` folder (from **Lab 1**) into the `src/main/java` folder of your Maven project. Ensure that the `App.java` file already exists in this folder.

## Step 5: Move Test Files into `test/java` Folder
Move the `HybridTest.java` file (from the `u` folder of **Lab 1**) into the `src/test/java` folder. Ensure that `AppTest.java` is present in the same folder.

## Step 6: Add JUnit and Hamcrest Libraries
Place the JUnit and Hamcrest files (from **Lab 1**) into the `src/main/resources` folder that you created earlier when setting up the project.

## Step 7: Modify `pom.xml`
Open the `pom.xml` file (located at the root of the project), and replace its contents with the following:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.companyname.bank</groupId>
    <artifactId>consumerBanking</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.encoding>UTF-8</maven.compiler.encoding>
    </properties>

    <dependencies>
        <!-- JUnit 4.13.2 Dependency -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Surefire plugin to run the tests -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
    </build>
</project>
```

This configuration file defines the project’s dependencies and plugins, including JUnit 4.13.2 for testing.

## Step 8: Compile the Project
To compile the project, run:
```bash
mvn compile
```
This will generate a `target` folder containing the compiled code.

## Step 9: Run Tests
To run the tests, use the following command:
```bash
mvn clean test
```
This will execute the tests in both `HybridTest.java` and `AppTest.java`.

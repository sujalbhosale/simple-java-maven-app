# simple-java-maven-app

A simple Java application built using Maven.

## Requirements

- **Java Development Kit (JDK)**: Version 17 or higher (Java 21/26 recommended)
- **Maven**: Version 3.8+ (to build/test from command-line)

## Project Structure

```text
simple-java-maven-app/
├── src/
│   ├── main/java/com/example/App.java       # Main source file
│   └── test/java/com/example/AppTest.java   # Unit tests
├── .gitignore                               # Files ignored by Git
├── pom.xml                                  # Maven build configuration
└── README.md                                # This documentation
```

## Getting Started

### Compiling and Running without Maven
If you do not have Maven installed globally, you can compile and run the application using the JDK directly:

1. **Compile**:
   ```bash
   javac src/main/java/com/example/App.java -d target/classes
   ```

2. **Run**:
   ```bash
   java -cp target/classes com.example.App
   ```

### Running with Maven

#### Option A: Using the Local Portable Maven Installation
Since Maven is pre-configured on this system inside the parent directory at `d:\Sujal\Antigravity\maven-bin\apache-maven-3.9.9`, you can use it to build and run:

1. **Compile & Package**:
   ```bash
   ..\maven-bin\apache-maven-3.9.9\bin\mvn.cmd package
   ```
2. **Run Tests**:
   ```bash
   ..\maven-bin\apache-maven-3.9.9\bin\mvn.cmd test
   ```
3. **Execute Main Class**:
   ```bash
   ..\maven-bin\apache-maven-3.9.9\bin\mvn.cmd exec:java -Dexec.mainClass="com.example.App"
   ```

#### Option B: Using a Global Maven Installation
If you have a global installation of Maven configured:

1. **Compile & Package**:
   ```bash
   mvn package
   ```
2. **Run Tests**:
   ```bash
   mvn test
   ```
3. **Execute Main Class**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

You can also run the packaged JAR directly once built:
```bash
java -jar target/simple-java-maven-app-1.0-SNAPSHOT.jar
```

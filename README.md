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
If Maven is installed on your system:

1. **Compile & Packages**:
   ```bash
   mvn package
   ```

2. **Run Tests**:
   ```bash
   mvn test
   ```

3. **Run Application**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```
   Or run the generated jar:
   ```bash
   java -jar target/simple-java-maven-app-1.0-SNAPSHOT.jar
   ```

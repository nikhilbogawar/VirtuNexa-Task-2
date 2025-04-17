
# Binary to Decimal Converter (Java Swing)

## How to Compile and Run

### Requirements:
- Java SDK installed (make sure `javac` and `jar` are available in terminal)

### Steps:

1. Open terminal and navigate to this project folder.

2. Compile the source code:

```
javac -d bin src/com/app/BinaryConverterApp.java
```

3. Package the compiled classes into a JAR file:

```
jar cfm BinaryConverterApp.jar manifest.txt -C bin .
```

4. Run the JAR file:

```
java -jar BinaryConverterApp.jar
```

## Files
- `src/com/app/BinaryConverterApp.java`: Source code
- `manifest.txt`: Contains `Main-Class` declaration
- `bin/`: Output directory for compiled class files

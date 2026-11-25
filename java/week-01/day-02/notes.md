# Week 1 – Day 2: Java Program Structure and Output
## 1. Java Program Structure
A basic Java program consists of a class and a method from which execution begins.
Example:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, SAP!");
    }
}
```
### Explanation
- `public`: Access modifier.
- `class`: Keyword used to declare a class.
- `Main`: Class name.
- `{ }`: Braces define the body of a class or method.
- `main()`: Entry point recognized by the Java launcher.
- `System.out.println()`: Displays output in the console.

## 2. Class and File Name
A class is a blueprint that defines the structure and behavior of objects.

When a class is declared as public, the source file name must match the class name.

Example:
```java
public class Main {
}
```
File name:
```text
Main.java
```
Other examples:
| Public class  | File name       |
|---------------|-----------------|
| `Main`        | `Main.java`     |
| `Student`     | `Student.java`  |
| `Employee`    | `Employee.java` |

## 3. Main Method
The `main()` method is the entry point recognized by the Java launcher when starting a conventional Java application.

Syntax:
```java
public static void main(String[] args) {
    
}
```
| Keyword         | Meaning                                         |
|-----------------|-------------------------------------------------|
| `public`        | Allows the Java launcher to access the method   |
| `static`        | Method can be called without creating an object |
| `void`          | Method does not return a value                  |
| `main`          | Entry point method name                         |
| `String[] args` | Array of command-line arguments                 |

## 4. Statements and Semicolon
A statement is an instruction that performs an action in a Java program.
Most Java statements end with a semicolon `;`.

Correct:
```java
System.out.println("Hello");
```
Incorrect:
```java
System.out.println("Hello")
```
The second statement produces a compilation error because the semicolon is missing.

## 5. print() and println()
### print()
`print()` displays output without automatically moving to the next line.
Example:
```java
System.out.print("Hello ");
System.out.print("Java");
```
Output:
```text
Hello Java
```
### println()
`println()` displays output and then moves to the next line.
Example:
```java
System.out.println("Hello");
System.out.println("Java");
```
Output:
```text
Hello
Java
```

### Difference
| print()                                      | println()                             |
|----------------------------------------------|---------------------------------------|
| Displays output                              | Displays output                       |
| Does not automatically move to the next line | Moves to the next line after printing |
| Useful for same-line output                  | Useful for separate-line output       |

An empty `println()` prints a blank line.

Example:
```java
System.out.println("Hello");
System.out.println();
System.out.println("Java");
```
Output:

```text
Hello

Java
```
## 6. Comments in Java
Comments are explanatory text written in source code that is ignored by the compiler.

### Single-line comment
```java
// This is a single-line comment
```
### Multi-line comment
```java
/*
This is a multi-line comment.
It can contain multiple lines.
*/
```
### Documentation comment
```java
/**
 * This is a documentation comment.
 */
```
Documentation comments can be used to generate API documentation with the `javadoc` tool.

## 7. Escape Sequences
Escape sequences represent special characters inside strings.
| Escape sequence   | Meaning               |
|-------------------|-----------------------|
| `\n`              | New line              |
| `\t`              | Horizontal tab        |
| `\"`              | Double quotation mark |
| `\\`              | Backslash             |

### New line example
```java
System.out.print("Hello\nJava");
```
Output:
```text
Hello
Java
```
### Tab example
```java
System.out.println("Name\tAge");
System.out.println("Anika\t22");
```
Output:
```text
Name    Age
Anika   22
```
### Double quotation example
```java
System.out.println("She said \"Hello\"");
```
Output:
```text
She said "Hello"
```

## 8. First Output Practice Program
```java
public class Main {

    public static void main(String[] args) {

        // My first Java output practice

        System.out.println("My name is Anika");
        System.out.print("I am learning ");
        System.out.print("Java");

        System.out.println();

        System.out.println("My goal is to become a Java Developer");

        System.out.println("I am preparing for SAP");

    }
}
```
Output:
```text
My name is Anika
I am learning Java
My goal is to become a Java Developer
I am preparing for SAP
```

## 9. Important Interview Questions
### Q1. What is a class in Java?
A class is a blueprint that defines the structure and behavior of objects.

### Q2. What is the main method?
The main method is the entry point recognized by the Java launcher when starting a conventional Java application.

### Q3. What is the difference between print() and println()?
`print()` displays output without automatically moving to the next line, whereas `println()` displays output and then moves to the next line.

### Q4. Why must a public class name match the file name?
Java requires a public top-level class to be declared in a source file with the same name as the class.

### Q5. What are comments?
Comments are explanatory text in source code that is ignored by the compiler.

### Q6. What is an escape sequence?
An escape sequence represents a special character inside a string, such as `\n` for a new line or `\t` for a tab.

## Day 2 Summary
- A Java program is organized using classes and methods.
- The main method is the conventional entry point of a Java application.
- Most Java statements end with a semicolon.
- `print()` does not automatically move to the next line.
- `println()` moves to the next line after printing.
- Comments are ignored by the compiler.
- Escape sequences represent special characters.
- Output prediction helps develop logical thinking and debugging skills.
# Day 3 — Variables and Data Types
## 1. What is a Variable?
A variable is a storage location used to hold a value that can be used or changed during program execution.

Example:
```java
int age = 25;
```
Here:
- `int` is the data type.
- `age` is the variable name.
- `25` is the value.
- `=` is the assignment operator.
- `;` marks the end of the statement.

## 2. Variable Declaration and Initialization
### Declaration
Creating a variable without assigning a value.
```java
int age;
```
### Assignment
Assigning a value to an existing variable.
```java
age = 25;
```

### Initialization
Declaring a variable and assigning its initial value.
```java
int age = 25;
```

## 3. Data Types in Java
A data type specifies the kind of value a variable can store.

| Data Type   | Description      | Example                    |
|-------------|------------------|----------------------------|
| `int`       | Whole numbers    | `int age = 25;`            |
| `double`    | Decimal numbers  | `double price = 99.5;`     |
| `char`      | Single character | `char grade = 'A';`        |
| `boolean`   | True or false    | `boolean isActive = true;` |
| `String`    | Text             | `String name = "Anika";`   |

### Important Difference
`char` uses single quotes:
```java
char letter = 'A';
```
`String` uses double quotes:
```java
String message = "Hello";
```
`String` is a reference type, while `int`, `double`, `char`, and `boolean` are primitive types.

## 4. Changing a Variable's Value
A variable can be reassigned.
```java
int leavesTaken = 5;
leavesTaken = 6;
System.out.println(leavesTaken);
```
Output:
```text
6
```
The variable's value changes from `5` to `6`.

## 5. Variable Naming Rules
Valid variable names:
```java
int age = 25;
int employeeAge = 25;
int totalLeaves = 20;
```
Invalid variable names:
```java
int 2age = 25;          // Cannot start with a digit
int employee age = 25;  // Cannot contain spaces
int class = 10;         // Cannot use a Java keyword
```
### Naming Rules
- A variable name can begin with a letter, underscore (`_`), or dollar sign (`$`).
- It cannot begin with a digit.
- Spaces are not allowed.
- Java keywords cannot be used as variable names.
- Variable names are case-sensitive.
  For example:
```java
int age = 25;
int Age = 30;
```
`age` and `Age` are two different variables.

### camelCase Convention
Java variables generally use camelCase.
```java
int totalLeaves = 20;
int leavesTaken = 5;
int remainingLeaves = 15;
```

## 6. The `final` Keyword
The `final` keyword prevents a variable from being reassigned after it has been assigned a value.
```java
final int MAX_LEAVES = 20;
```
This is allowed:

```java
final int MAX_LEAVES = 20;
```
This causes a compilation error:
```java
MAX_LEAVES = 25;
```
A `final` variable can be assigned only once.

```java
final double PI = 3.14159;
final int MAX_ATTEMPTS = 3;
```

This naming convention is called `UPPER_SNAKE_CASE`.

## 7. Arithmetic with Variables
Java supports arithmetic operations such as:

| Operator  | Operation      |
|-----------|----------------|
| `+`       | Addition       |
| `-`       | Subtraction    |
| `*`       | Multiplication |
| `/`       | Division       |
| `%`       | Remainder      |

Example:
```java
int totalLeaves = 20;
int leavesTaken = 5;
int remainingLeaves = totalLeaves - leavesTaken;
System.out.println(remainingLeaves);
```
Output:
```text
15
```

## 8. String Concatenation
The `+` operator can join strings and values.
```java
String employeeName = "Anika";

System.out.println("Employee: " + employeeName);
```
Output:
```text
Employee: Anika
```

This process is called string concatenation.

## 9. Day 3 Practice Program

```java
public class Main {
    public static void main(String[] args) {

        String employeeName = "Anika";
        int totalLeaves = 20;
        int leavesTaken = 5;

        int remainingLeaves = totalLeaves - leavesTaken;

        final int MAX_LEAVES = 20;

        System.out.println("Employee: " + employeeName);
        System.out.println("Remaining leaves: " + remainingLeaves);
        System.out.println("Maximum leaves: " + MAX_LEAVES);
    }
}
```
Output:
```text
Employee: Anika
Remaining leaves: 15
Maximum leaves: 20
```
## 10. Key Takeaways
- A variable stores a value under a name.
- Every variable has a data type.
- `int` stores whole numbers.
- `double` stores decimal numbers.
- `char` stores a single character.
- `boolean` stores `true` or `false`.
- `String` stores text.
- Variables can be reassigned.
- Java variable names are case-sensitive.
- `final` prevents reassignment.
- Java commonly uses camelCase for variables.
- Constants commonly use UPPER_SNAKE_CASE.
- Variables can be used in arithmetic expressions.
- The `+` operator can join text and values.

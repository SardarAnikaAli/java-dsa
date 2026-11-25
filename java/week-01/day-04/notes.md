# Day 4 — Operators and Expressions

## 1. What is an Operator?
An operator is a symbol that performs an operation on one or more values. ex- +,-,*,%

An expression is a combination of values, variables, and operators that produces a result.
Example:
```java
10 + 5 * 2
```

## 2. Arithmetic Operators
Arithmetic operators perform mathematical calculations.

| Operator  | Meaning        | Example   | Result  |
|-----------|----------------|-----------|---------|
| `+`       | Addition       | `10 + 5`  | `15`    |
| `-`       | Subtraction    | `10 - 5`  | `5`     |
| `*`       | Multiplication | `10 * 5`  | `50`    |
| `/`       | Division       | `10 / 5`  | `2`     |
| `%`       | Remainder      | `10 % 3`  | `1`     |

### Modulus Operator `%`
The modulus operator returns the remainder after division.
```java
int result = 10 % 3;
System.out.println(result);
```
Output:
```text
1
```
```java
int number = 8;
System.out.println(number % 2);
```
Output:
```text
0
```
If a number divided by 2 gives remainder 0, it is even.

## 3. Integer Division and Decimal Division
When both operands are integers, Java performs integer division.
```java
System.out.println(10 / 3);
```
Output:
```text
3
```
The decimal part is discarded.

```java
System.out.println(10.0 / 3);
```
Output:
```text
3.3333333333333335
```

## 4. Assignment Operators
Assignment operators assign or update values in variables.

| Operator   | Equivalent      |
|------------|-----------------|
| `=`        | Assign a value  |
| `+=`       | `x = x + value` |
| `-=`       | `x = x - value` |
| `*=`       | `x = x * value` |
| `/=`       | `x = x / value` |
| `%=`       | `x = x % value` |

Example:
```java
int score = 10;
score += 5;
System.out.println(score);
```
Output:
```text
15
```
## 5. Increment and Decrement Operators
The increment operator `++` increases a variable's value by 1.
```java
int count = 5;
count++;
System.out.println(count);
```
Output:
```text
6
```

The decrement operator `--` decreases a variable's value by 1.
```java
int count = 5;
count--;
System.out.println(count);
```
Output:
```text
4
```

## 6. Relational Operators
Relational operators compare two values and return a boolean result.

| Operator   | Meaning                  |
|------------|--------------------------|
| `>`        | Greater than             |
| `<`        | Less than                |
| `>=`       | Greater than or equal to |
| `<=`       | Less than or equal to    |
| `==`       | Equal to                 |
| `!=`       | Not equal to             |

Example:

```java
int age = 25;
System.out.println(age > 18);
System.out.println(age == 25);
System.out.println(age < 18);
```
Output:
```text
true
true
false
```

### Difference Between `=` and `==`
- `=` assigns a value.
- `==` compares two values.

```java
int age = 25;
System.out.println(age == 25);
```

Output:
```text
true
```

## 7. Logical Operators
Logical operators combine or reverse boolean conditions.
### AND — `&&`
Returns `true` only when both conditions are true.

| A     | B     | A && B  |
|-------|-------|---------|
| true  | true  | true    |
| true  | false | false   |
| false | true  | false   |
| false | false | false   |

Example:
```java
int age = 22;
boolean hasValidID = true;
System.out.println(age >= 18 && hasValidID);
```
Output:
```text
true
```

### OR — `||`
Returns `true` when at least one condition is true.

| A     | B     | A \|\| B   |
|-------|-------|------------|
| true  | true  | true       |
| true  | false | true       |
| false | true  | true       |
| false | false | false      |

Example:
```java
boolean hasEmail = false;
boolean hasPhone = true;
System.out.println(hasEmail || hasPhone);
```
Output:
```text
true
```
### NOT — `!`
Reverses a boolean value.
```java
boolean isRaining = false;
System.out.println(!isRaining);
```
Output:
```text
true
```

## 8. Operator Precedence
Operator precedence determines the order in which operators are evaluated.
Example:
```java
int result = 10 + 5 * 2;
System.out.println(result);
```
Output:
```text
20
```
Multiplication is performed before addition.

### Using Parentheses
Parentheses can change the evaluation order.
```java
int result = (10 + 5) * 2;
System.out.println(result);
```
Output:
```text
30
```

### Common Precedence Order
From higher to lower precedence:
1. Parentheses `()`
2. Multiplication, division, remainder: `*`, `/`, `%`
3. Addition, subtraction: `+`, `-`
4. Relational operators: `<`, `>`, `<=`, `>=`
5. Equality operators: `==`, `!=`
6. Logical AND: `&&`
7. Logical OR: `||`
8. Assignment operators: `=`, `+=`, `-=`, etc.

When in doubt, use parentheses to make expressions easier to read.

## 9. Day 4 Practice Program

```java
public class Main {
    public static void main(String[] args) {
        int totalMarks = 100;
        int marksObtained = 75;
        int remainingMarks = totalMarks - marksObtained;
        int bonusMarks = 5;
        marksObtained += bonusMarks;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Marks obtained: " + marksObtained);
        System.out.println("Remaining marks: " + remainingMarks);
    }
}
```

Output:

```text
Total marks: 100
Marks obtained: 80
Remaining marks: 25
```

## 10. Key Takeaways

- Arithmetic operators perform calculations.
- `%` returns the remainder.
- Integer division discards the decimal part.
- Assignment operators update variable values.
- `++` increases a value by 1.
- `--` decreases a value by 1.
- Relational operators return boolean results.
- `==` compares values; `=` assigns values.
- `&&` means AND.
- `||` means OR.
- `!` means NOT.
- Operator precedence determines evaluation order.
- Parentheses can make expressions easier to understand.

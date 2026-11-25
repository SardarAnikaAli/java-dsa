# Day 6: Conditions and Loops
## 1. Conditional Statements
Conditional statements allow a program to make decisions based on conditions.

### `if`
Executes a block when the condition is true.
```java
int marks = 75;

if (marks >= 40) {
    System.out.println("Pass");
}
```
### `if-else`
Executes one block if the condition is true and another if it is false.
```java
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```
### `if-else if-else`
Used to check multiple conditions.
```java
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 40) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

Java checks conditions from top to bottom. Once a condition is true, its block executes and the remaining branches are skipped.

## 2. Loops
A loop repeatedly executes a block of code while its condition is satisfied.

### `for` loop
Commonly used when the number of repetitions is known.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
Output:
```text
1
2
3
4
5
```
Syntax:
```java
for (initialization; condition; update)
```
- Initialization: runs once at the beginning.
- Condition: checked before each iteration.
- Update: runs after each iteration.

### `while` loop
Checks the condition before executing the body.
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```
If the condition is false initially, the body does not execute.
Remember to update the loop variable to avoid an infinite loop.

### `do-while` loop
Executes the body at least once because the condition is checked after the body.
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

A semicolon is required after the `while` condition.

## 3. `break` and `continue`
### `break`
Immediately exits the loop.
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }

    System.out.println(i);
}
```
Output:
```text
1
2
```

### `continue`
Skips the current iteration and continues with the next iteration.
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```
Output:
```text
1
2
4
5
```

## 4. Modulus Operator with Conditions
The modulus operator `%` returns the remainder of a division.

```java
int number = 10;
if (number % 2 == 0) {
    System.out.println("Even");
}
```
- `number % 2 == 0` checks whether a number is even.
- `number % 3 == 0` checks whether a number is divisible by 3.

## 5. Practice Program: Even Numbers
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```
Output:
```text
2
4
6
8
10
```
## Day 6 Key Takeaways
- Conditions help programs make decisions.
- Loops repeat code.
- `for` is useful when repetitions are known.
- `while` checks the condition before execution.
- `do-while` executes at least once.
- `break` exits a loop.
- `continue` skips the current iteration.
- `%` is useful for checking divisibility and even/odd numbers.

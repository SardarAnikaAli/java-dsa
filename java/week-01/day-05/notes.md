# Day 5: Type Casting and User Input
## 1. Type Casting
Type casting is the process of converting a value from one data type to another.

### Widening Casting (Implicit)
Converting a smaller data type into a larger compatible data type.
```java
int number = 10;
double decimalNumber = number;
System.out.println(decimalNumber); // 10.0
```

- Java performs this conversion automatically.
- No explicit casting is required.

### Narrowing Casting (Explicit)
Converting a larger data type into a smaller data type.
```java
double price = 99.75;
int wholePrice = (int) price;
System.out.println(wholePrice); // 99
```
- Explicit casting is required.
- The decimal part is truncated, not rounded.
- `99.75` becomes `99`.

## 2. Taking User Input
Java provides the `Scanner` class to read input from the user.

### Import Scanner
```java
import java.util.Scanner;
```
### Create a Scanner object
```java
Scanner input = new Scanner(System.in);
```
- `Scanner` is the class.
- `input` is the object reference.
- `System.in` represents standard input, usually the keyboard.

### Scanner methods
| Method          | Purpose                |
|-----------------|------------------------|
| `nextInt()`     | Reads an integer       |
| `nextDouble()`  | Reads a decimal number |
| `next()`        | Reads one word         |
| `nextLine()`    | Reads an entire line   |
| `nextBoolean()` | Reads a boolean value  |

Example:
```java
int age = input.nextInt();
double salary = input.nextDouble();
String name = input.nextLine();
```

## 3. Difference Between `next()` and `nextLine()`
```java
String firstName = input.next();
```
Reads only one word.

```java
String fullName = input.nextLine();
```
Reads the complete line, including spaces.

For example, `nextLine()` can read:
```text
Anika Ali
```

while `next()` reads only:
```text
Anika
```

## 4. Important Scanner Note
When using `nextInt()` or `nextDouble()` followed by `nextLine()`, the newline left in the input buffer may be consumed by `nextLine()`.

Example:
```java
int age = input.nextInt();
input.nextLine(); // Consume the leftover newline
String name = input.nextLine();
```

## 5. Closing Scanner
After finishing input:
```java
input.close();
```
This closes the Scanner and its associated input resource.

## 6. Practice Program: Employee Details
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter employee age: ");
        int age = input.nextInt();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        input.close();
    }
}
```
## Day 5 Key Takeaways

- Type casting converts one data type into another.
- Widening casting is usually automatic.
- Narrowing casting requires explicit casting.
- Casting a `double` to an `int` truncates the decimal part.
- `Scanner` is used to take input

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

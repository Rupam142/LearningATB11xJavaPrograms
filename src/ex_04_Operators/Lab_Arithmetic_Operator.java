package ex_04_Operators;

import java.util.Scanner;

public class Lab_Arithmetic_Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter only integers!");
            scanner.close();
            System.exit(0);
        }
        int a = scanner.nextInt();

        System.out.println("Enter the second number:");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter only integers!");
            scanner.close();
            System.exit(0);
        }
        int b = scanner.nextInt();

        scanner.close(); // Close scanner

        // Perform operations
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));

        // Prevent division by zero
        if (b != 0) {
            System.out.println("Division: " + div(a, b));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b; // This method will only be called if b != 0
    }
}


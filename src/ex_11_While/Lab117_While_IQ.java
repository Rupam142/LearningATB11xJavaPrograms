package ex_11_While;

import java.util.Scanner;

public class Lab117_While_IQ {
    public static void main(String[] args) {
        // Factorial Program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to fectorial program\n Enter the number whose factorial you want");
        int number = scanner.nextInt();  // read an integer input from the user

        int factorial = 1;  // Initialize the factorial variable to 1
        if (number <= 0){   // Check if the number is less than or equal to 0
            System.out.println(factorial);  // if true print the factorial
        }else {
            // If the number is greater than 0. calculate the factorial
            for (int i=1; i<=number; i++){   // loop from 1 to the factorial
                factorial = factorial*i;     // Multiply the current factorial value by
            }
        }

        System.out.println("Factorial is ->" +factorial);



    }
}

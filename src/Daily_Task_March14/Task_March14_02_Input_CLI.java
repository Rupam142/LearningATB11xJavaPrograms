package Daily_Task_March14;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_March14_02_Input_CLI {
    // Take a user input - Name, Age and Salary and print them in the end.
    public static void main(String[] args) {
        // Using CLI Option:

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println("Enter the name , age and salary");

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

                // Using Scanner class
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name = scanner.next();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = scanner1.nextInt();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter you Salary");
//        double salary = scanner2.nextDouble();
//
//        //System.out.println("Name,Age,Salary");
//
//        System.out.println("Your name is " + name + ", age is " + age + " and salary is "+salary);

        // Close the scanner
        // scanner.close();

    }










}

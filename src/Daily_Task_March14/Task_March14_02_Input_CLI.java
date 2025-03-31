package Daily_Task_March14;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_March14_02_Input_CLI {
    // Take a user input - Name, Age and Salary and print them in the end.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter you Salary");
        double salary = scanner2.nextDouble();

        //System.out.println("Name,Age,Salary");

        System.out.println("Your name is " + name + ", age is " + age + " and salary is "+salary);
    }









}

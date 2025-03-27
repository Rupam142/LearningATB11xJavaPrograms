package ex_08_If_Condition;

import java.util.Scanner;

public class Lab078_If_Else {
    public static void main(String[] args) {
        // How to take the user input.
        // 1. CLI option
        //
        // int age = Integer.parseInt(args[0]);   // Either you can use this syntax.

        // 2. Scanner Class                       // Either we can use this syntax.
        Scanner scanner = new Scanner(System.in);   // If you want to take input use this syntax. E
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);


        if(age > 18){
            System.out.println("Yes, you can allowed to vote");
        } else {
            System.out.println("You can not allowed to vote");
        }


    }
}

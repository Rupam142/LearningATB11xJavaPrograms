package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab083_Switch_Without_Default_Statement {

    public static void main(String[] args) {

        // If there is no Default statement:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = scanner.nextInt();

        switch (day){

            case 1 :
                System.out.println("Mon");

            case 2 :
                System.out.println("Tue");


                // If there is not default statement then it will not print anything.
                // Suppose her is only 2 cases, if i want to 3rd day it not print anything,
                // Even default or any error also not print.
        }

    }


}

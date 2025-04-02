package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab082_Switch_Without_Break_Statement {
    public static void main(String[] args) {
        // Switch

        // Take a user input ant tell them the day which they have told.
        // 1 to 7 -> 1 -> Mon, 5 -> Fri
        // 8 ? - Not allowed or error

        // int day = Integer.parseInt(args[0]); - CLI option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day){

            case 1 :
                System.out.println("Mon");


            case 2 :
                System.out.println("Tue");
                    // if we will not use break; statement then it will
                    // print all the cases after the selected day number

            case 3 :
                System.out.println("Wed");



            case 4 :
                System.out.println("Thru");



            case 5 :
                System.out.println("Fri");



            case 6 :
                System.out.println("Sat");



            case 7 :
                System.out.println("Sun");



            default:
                System.out.println("Invalid , day number");




        }

    }
}

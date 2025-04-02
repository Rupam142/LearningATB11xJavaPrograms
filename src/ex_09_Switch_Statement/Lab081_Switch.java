package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab081_Switch {
    public static void main(String[] args) {
        // Switch

        // Take a user input ant tell them the day which they have told.
        // 1 to 7 -> 1 -> Mon, 5 -> Fri
        // 8 ? - Not allowed or error

        // int day = Integer.parseInt(args[0]); - CLI option


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");  // if we will enter the String value,
        int day = scanner.nextInt();                      // // it will show error "InputMismatchException"

        switch (day){

            case 1 :
                System.out.println("Mon");
                break;

            case 2 :
                System.out.println("Tue");
                break;

            case 3 :
                System.out.println("Wed");
                break;


            case 4 :
                System.out.println("Thru");
                break;


            case 5 :
                System.out.println("Fri");
                break;


            case 6 :
                System.out.println("Sat");
                break;


            case 7 :
                System.out.println("Sun");
                break;


            default:
                System.out.println("Invalid , day number");
                break;



        }

    }
}

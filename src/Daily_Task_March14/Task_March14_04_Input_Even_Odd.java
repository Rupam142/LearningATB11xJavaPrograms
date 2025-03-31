package Daily_Task_March14;

import java.util.Scanner;

public class Task_March14_04_Input_Even_Odd {
    public static void main(String[] args) {

        //Create a Program - Take user input & Check weather the input is even or odd number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();

        if(a%2 == 0){
            System.out.println(a + " " + "is even number");
        }else{
            System.out.println(a + " " + "is odd number");
        }


    }
}

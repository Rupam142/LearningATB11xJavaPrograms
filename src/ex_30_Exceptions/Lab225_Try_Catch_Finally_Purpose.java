package ex_30_Exceptions;

import java.util.Scanner;

public class Lab225_Try_Catch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int b = 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {      // finally is optional, try and catch works
            sc.close();
            System.out.println("end of the program , sc closed");  // if the no. is negative or positive 'sc' will be closed.
        }
    }
}

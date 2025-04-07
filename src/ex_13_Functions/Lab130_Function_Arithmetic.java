package ex_13_Functions;

import java.util.Scanner;

public class Lab130_Function_Arithmetic {
    public static void main(String[] args) {

        // Create a function of Sum, Sub, Mul, Mod, Div
        // with parameter, a , b (take the parameter from the user)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        // a,b -> int -> Scanner
        // int -> variable result ->

        // Step 2 -> Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/parameters

        // Step 3 -> Write the code and find and Fix -> Edge Cases


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {                                 // These 24 to 30 line code is for Edge cases where if we will enter any value apart of int it will display "Enter the int value only"
            System.out.println("Enter the int only");
            System.exit(0);
        }
        //int a = scanner.nextInt();      / In this syntax if we enter any 'String/char' and code will broken.

        System.out.println("Enter the num2");
        int b = 0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }else {                         // These 33 to 40 line code is for Edge cases where if we will enter any value apart of int it will display "Enter the int value only"
            System.out.println("Enter the int only");
            System.exit(0);
        }
        //int b = scanner.nextInt();

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_mod = mod(a,b);
        int result_div = div(a,b);
        float result_div1 = div1(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_mod);
        System.out.println(result_div);
        System.out.println(result_div1);

    }


    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int mod(int a, int b){
        return a%b;
    }

    static int div(int a, int b){
        if (b ==0){
            System.out.println("Div by zero is not allowed");
            System.exit(0);
        }
        return a/b;
    }

    static float div1(float a, float b){
        return a/b;
    }

}

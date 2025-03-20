package ex_04_Operators;

public class Lab034_Operators_Arithmetic_Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        //     +(Addition)
        //     -(Subtraction)
        //     *(Multiplication)
        //     /(Division)
        //     %(Modulus)/Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);    // if result will come in decimal but it will print will integer value not decimal value also(means it will npt take integer part)
        System.out.println(a/c);    // if it will divide by any float no. or decimal no. it will print in decimal value.


        System.out.println("a+b");   //double quotes only use in String,
        System.out.println(a+b);     // this is right syntax.

    }
}

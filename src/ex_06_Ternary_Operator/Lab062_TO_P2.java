package ex_06_Ternary_Operator;

public class Lab062_TO_P2 {
    public static void main(String[] args) {
        // Find the Maximum number between two number.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));  // Max number
        System.out.println(Math.min(x,y));  // Min number

        String max = x > y ? "x is max" : "y is max";   // Ternary operator example for nested
        System.out.println(max);



    }
}

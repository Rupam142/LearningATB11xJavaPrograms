package ex_07_Increment_Decrement_Operator;

public class Lab067_Pre_Increment_Operator {
    public static void main(String[] args) {
        // pre - Increment --> ++operand
        // value is incremented first and then stored in the result.
        // value increased by 1

        int a = 10;
        int b = ++a;   // 10+1 -> 11
        System.out.println(b);   // 10+1 -> 11
        System.out.println(a);   // 11


        // Explain how output came

        // Exp and result table
        // Line no | a | Result b
        // 9 | 10 | NA
        // 10 | 11 | 11
        // 11 | 11(NA) | 11
        // 12 | 11 | 11(NA)

    }
}

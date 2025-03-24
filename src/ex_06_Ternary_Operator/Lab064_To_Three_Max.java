package ex_06_Ternary_Operator;

public class Lab064_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        int n3 = 20;

        //Logic Building Formula

        // Step 1 : Find inputs / Outputs
        // I/O -> n1 , n2 , n3 in int format
        // Output format : String -> which is the Max number.

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1 > n3 -> n1
        // n2 > n3 and n2 > n1 -> n2
        // n3

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println("Max is" + " = " + +max);

        // A -> (n1 > n3) ? n1 : n3

    }
}

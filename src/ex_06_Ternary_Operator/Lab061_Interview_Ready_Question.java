package ex_06_Ternary_Operator;

public class Lab061_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition ? "Expression1" : "Expression2";

               //This is not the example of Nested Ternary Operator:
        int number = 5;
        String result = number > 10 ? "Positive" : "Negative";
        System.out.println(result);

            // This is the example of Nested Ternary Operator:
        int number1 = 25;
        String result1 = (number1 > 10) ? (number1 > 20 ? "N > 20" : "N < 20") : "Negative";
        System.out.println(result1);
    }
}

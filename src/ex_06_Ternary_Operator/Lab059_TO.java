package ex_06_Ternary_Operator;

public class Lab059_TO {
    public static void main(String[] args) {
        // Ternary operator syntax:  result = condition ? "Expression1" : "Expression2";
        // ? :
        int age =10;
        int age1 = 19;
        String canIVote = age >= 18 ? "Yes, you can vote" : "No, you can't vote";
        String canIVote1 = age1 >= 18 ? "Yes, you can vote" : "No, you can't vote";
        System.out.println(canIVote);
        System.out.println(canIVote1);
    }
}

package ex_07_Increment_Decrement_Operator;

public class Lab068_Pre_Post_ID_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);   // 11 (first increased and then print)
        System.out.println(a);     // 11

        // Post Increment = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);  // 10(print first) , 11(then increase)
        System.out.println(a_post);    // 11

        //Explain the output
        // Line no. | a_post | Exp(result)
        // 10 | 10 | NA
        // 11 | 10 | 11
        // 12 | 11

    }
}

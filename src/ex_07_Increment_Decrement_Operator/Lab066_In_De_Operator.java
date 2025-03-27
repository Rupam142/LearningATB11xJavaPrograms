package ex_07_Increment_Decrement_Operator;

public class Lab066_In_De_Operator {
    public static void main(String[] args) {
        // For take input
        String age_string = args[0];
        String age1 = args[1];     // suppose using multiple arguments usi CLI (Like 55 62 Rupam 23)
        String age2 = args[2];     // Arguments(args[]) always starts with 0
        String age3 = args[3];
        int age = Integer.parseInt(age_string);
        System.out.println(age);       // for run use CLI  "int age = Integer.parseInt(age_string);"
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
    }
}

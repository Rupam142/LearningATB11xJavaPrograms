package ex_04_Operators;

public class Lab040_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Java";
        String second_name = "Script";

        int a = 10;
        int b = 20;

        System.out.println(first_name + second_name + a + b);  // JavaScript1020 - first operator is String ,then will perform all will as Concatenation.

        System.out.println(a + b + first_name + second_name);  // 30JavaScript - first operator is int,then will perform all will as Concatenation.

        System.out.println(first_name + second_name + (a + b)); // JavaScript30 - if want to perform String and int both the need () bracket in integer .

        // BODMAS - Bracket of Div, multi, add, sub..


    }
}

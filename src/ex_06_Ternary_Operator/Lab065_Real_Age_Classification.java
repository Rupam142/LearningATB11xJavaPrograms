package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab065_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult (age > 18) , Minor (age < 18) , Senior (age > 65)
        // take an input from user

        String age = args[0];
        System.out.println(age);  //output will be 65 or 25 or 45 whatever we put in to the CLI.
        System.out.println(age instanceof String);

        int age1 = Integer.parseInt(age);

        String result = (age1 < 18) ? "Minor" : (age1 < 65) ? "Adult" : "Senior";
        System.out.println(result);



    }
}

package ex_13_Functions;

public class Lab128_User_Define_Function_Part1 {
    public static void main(String[] args) {

        // User Defined Functions:

        // 1. Without Parameters and Without Return Type.
        // 2. Without Parameters but With Return Type
        // 3. With Parameters and Without Return Type
        // 4. With Parameters and With Return Type.

        // 1. Without Argument / Parameters and Without Return Type.

        // int r = wp_wr_greet();    -> we can't assign any value because it is 'void'
        wp_wr_greet();


        // 2. Without Parameters but With Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);


        // 3. With Parameters and Without Return Type(90%)
        greet_with_details("Rupam", 32, 500);
        greet_with_details("Roop", 32, 300);

        greet_with_full_name("Rupam" , "Singh");


        // 4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3, 4);
        int sum1 = sum_of_two_numbers(12, 23);
        int sum2 = sum_of_three_numbers(122, 325, 652);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

        int result = Math.max(3,4);   // 4th Type

    }




    // 1. Without Argument / Parameters and Without Return Type.
    static void wp_wr_greet(){   // Here 'wp_wr_greet' is a function
        System.out.println("Hi, How are you");
    }


    // 2. Without Parameters but With Return Type
    static String greet_with_hello_wp_with_RT(){
        System.out.println("Hi");
        return ("Hi, Java is a language");
    }


    // 3. With Parameters and Without Return Type
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is:" +name + "\nYour age is:" +age + "\nYour salary is:" +salary);
    }

    // example-2
    static void greet_with_full_name(String firstname , String lastname){
        System.out.println("Hi your full name is:" +firstname + lastname);
    }



    // 4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a , int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a , int b , int c){
        return a+b+c;

    }




}

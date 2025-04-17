package ex_30_Exceptions;

public class Lab213_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user = args[0];   // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(input_user); // if we will  enter String input, then also will show java.lang.NumberFormatException: For input string: "rup" error
        int output = 100/a;    // if we will enter 0 input ,then it will show java.lang.ArithmeticException error
        System.out.println(output);
        System.out.println("End of the program");


        // program is looks like simple but have problem
        // 1. java.lang.ArrayIndexOutOfBoundsException
        // 2. java.lang.NumberFormatException: For input string: "rup"
        // 3. java.lang.ArithmeticException: Index 0 out of bound

    }
}

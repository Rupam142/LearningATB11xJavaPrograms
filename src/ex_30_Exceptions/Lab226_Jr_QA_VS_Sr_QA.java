package ex_30_Exceptions;

public class Lab226_Jr_QA_VS_Sr_QA {
    public static void main(String[] args) {

//        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
//        int a = Integer.parseInt(ip);  // NumberFormatException
//        int b = 100/a;   // ArithmeticException
//        System.out.println(b);

          // As per the Junior QA
        String ip = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; // ArithmeticException
        try {
            b = 100 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);


    }
}

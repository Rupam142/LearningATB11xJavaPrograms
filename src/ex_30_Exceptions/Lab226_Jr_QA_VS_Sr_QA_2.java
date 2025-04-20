package ex_30_Exceptions;

public class Lab226_Jr_QA_VS_Sr_QA_2 {
    public static void main(String[] args) {

        // Jr. QA
        //String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
//        int a = Integer.parseInt(ip);  // NumberFormatException
//        int b = 100/a;   // ArithmeticException
//        System.out.println(b);     // just select all 7 to 10 line and click on surround

        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);  // NumberFormatException
            int b = 100/a;   // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

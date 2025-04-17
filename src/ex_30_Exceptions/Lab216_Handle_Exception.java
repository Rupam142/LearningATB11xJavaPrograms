package ex_30_Exceptions;

public class Lab216_Handle_Exception {
    public static void main(String[] args) {

//        int a = 10/0;
//        System.out.println(a);   // we will get error "java.lang.ArithmeticException"

        // how to handle Exception error:

        int a = 0;   // select 10/0 , we will get 'Surround' , click on that and then click try and catch
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());   // output will be / by zero
        }
        System.out.println(a);    // output will be 0


        // Checked = JVM
        // JVM knows about it, During Compilation - JVM is saying that
        // There can be case when this file is not found
        //

        // JVM knows that this may lead to file not found exception
        // so it's telling to handle it.



    }
}

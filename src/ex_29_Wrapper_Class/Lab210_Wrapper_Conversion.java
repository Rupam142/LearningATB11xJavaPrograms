package ex_29_Wrapper_Class;

public class Lab210_Wrapper_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a;  // This is called as Boxing -> Automatically JVM will store the value of
        // primitive to wrapper -> This is also called as AutoBoxing
        System.out.println(b.intValue());   // Behaviour
        System.out.println(Integer.MIN_VALUE);   // Behaviour



        Integer a2 = 42;
        int v = a2;    // This ia type of UnBoxing -> Unboxing is wrapper is removed. It means attributes and behaviour is lost.
        System.out.println(v);




    }
}

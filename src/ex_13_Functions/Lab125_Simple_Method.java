package ex_13_Functions;

public class Lab125_Simple_Method {
    public static void main(String[] args) {
        // call
       // int result = pramod_f1();

        int result = return_int();
        System.out.println(result);   // this syntax is for return_int value

        boolean r = return_boolean();
        System.out.println(r);

    }

    //static returnDataType (void, any other datatype)
        // void - no return
    static void pramod_f1(){
        System.out.println("No Return");
    }

    static int return_int(){
        return 10;                   // this is called as returning function because there is no "void".
    }

    static boolean return_boolean(){
        //static void return_boolean(){    // it will not return any thing because of 'void'
        return true;        // it will return boolean data type
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }

    static String String(){
        return "Pramod";
    }




}


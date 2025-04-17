package ex_30_Exceptions;

public class Lab215_String_NullPointer {
    public static void main(String[] args) {
        String name= null;
        name.trim();    // can't trim null.  we will get error "java.lang.NullPointerException"
    }


}

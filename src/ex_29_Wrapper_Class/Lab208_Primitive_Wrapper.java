package ex_29_Wrapper_Class;

public class Lab208_Primitive_Wrapper {
    public static void main(String[] args) {
        // int a = 10;   // Primitive   // no need to use in Wrapper class
        // This is not object.
        // It will not have attribute or behaviour.

        // char, short, byte, long, float, double:  ----These are primitive data type but we will avoid them now.

        // We will use the Wrapper classes, Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
        System.out.println(age.doubleValue());
        System.out.println(age.toString());
    }
}

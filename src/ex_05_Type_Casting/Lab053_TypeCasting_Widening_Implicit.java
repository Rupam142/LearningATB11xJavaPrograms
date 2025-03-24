package ex_05_Type_Casting;

public class Lab053_TypeCasting_Widening_Implicit {
    public static void main(String[] args) {
        byte b = 10;
        int a = 'b'; // Valid syntax -> smaller data into the bigger data type
               // This is called "Implicit" - Casting - Widening

        System.out.println(a);

    }
}

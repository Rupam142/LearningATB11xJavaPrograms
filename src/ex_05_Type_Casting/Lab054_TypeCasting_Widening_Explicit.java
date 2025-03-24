package ex_05_Type_Casting;

public class Lab054_TypeCasting_Widening_Explicit {
    public static void main(String[] args) {
        byte b = 10;
        //int a = (int)b;  // This is Explicit Casting - (In case of Widening it doesn't require)
        int a1 = b;       // Valid -> In Implicit Casting - JVM will perform Automatically

        System.out.println(a1);

    }
}

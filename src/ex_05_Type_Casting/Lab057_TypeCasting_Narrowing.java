package ex_05_Type_Casting;

public class Lab057_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val;   // Invalid - Narrowing - Implicit Casting is not allowed.

        byte b1 = (byte)val;  // Valid - Narrowing - In case of Explicit Casting - Allowed

        //byte b1 = (int)val;   // Invalid - incompatible Data Type

        System.out.println(b1);

    }
}

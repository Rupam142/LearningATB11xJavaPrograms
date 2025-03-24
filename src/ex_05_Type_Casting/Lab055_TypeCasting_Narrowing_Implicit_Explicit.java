package ex_05_Type_Casting;

public class Lab055_TypeCasting_Narrowing_Implicit_Explicit {
    public static void main(String[] args) {
        int val = 200;
        //byte b = val;  // Invalid - In case of Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte)val;  // Valid - In case of Narrowing - Explicit Casting - Which is now Allowed.
                             // In this case Data Loss will occur also
        System.out.println(b2);



    }
}

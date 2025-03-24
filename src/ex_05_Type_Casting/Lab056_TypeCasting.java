package ex_05_Type_Casting;

public class Lab056_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9863567746l;
        //short s = phone_no;    // Implicit ?
        short s = (short)phone_no;  // Explicit Casting _ Narrowing

        System.out.println(s);   // It will print some Random/Garbage value - 6530
                                 //for explanation - search on ChatGpt- "Expalin this how the value is getting printed" and paste this code.
    }
}

package ex_07_Increment_Decrement_Operator;

public class Lab072_ID_Example1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);


        // a++ -> A -> Exp A -> 10, a -> 11
        // +
        // ++a -> B -> Exp B -> 12, a-> 12
        // A+B -> ExpA+ + ExpB -> 10+12 -> 22 , a-> 12



    }
}

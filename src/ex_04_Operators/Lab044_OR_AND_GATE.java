package ex_04_Operators;

public class Lab044_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR GATE
        // Only false && false return true
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        // && - AND GATE
        // Only true && true return true
        // T || T -> T
        // T || F -> F
        // F || F -> F
        // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


    }
}

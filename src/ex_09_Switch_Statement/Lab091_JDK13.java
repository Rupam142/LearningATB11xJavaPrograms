package ex_09_Switch_Statement;

public class Lab091_JDK13 {
    public static void main(String[] args) {
        // JDK 13

        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:   // This comma(,) separated case
                System.out.println("All of them are Electric Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;

            default:
                System.out.println("None");
        }
    }
}

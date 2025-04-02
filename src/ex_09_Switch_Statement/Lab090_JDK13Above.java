package ex_09_Switch_Statement;

public class Lab090_JDK13Above {
    public static void main(String[] args) {

        // In JDK > 13
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");  // In one-liner arrows, the "break:" statement is not allowed.
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}

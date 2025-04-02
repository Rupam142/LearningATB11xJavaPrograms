package ex_09_Switch_Statement;

public class Lab092_Interview {
    public static void main(String[] args) {

        int a = 11;

        switch (-1){    // (-1) is matched
            default:
                System.out.println("Default");
                break;

            case -1:
                System.out.println("10");    // This code will execute
                break;

            case 9:
                System.out.println("9");
                break;
        }



    }
}

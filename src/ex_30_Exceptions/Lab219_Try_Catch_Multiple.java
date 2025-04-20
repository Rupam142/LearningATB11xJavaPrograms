package ex_30_Exceptions;

public class Lab219_Try_Catch_Multiple {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){    // this is the smaller exception
            System.out.println("ARE YOU FOOL");
        }
        catch (Exception e){     // this is the bigger exception
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");


            // Bigger exception is not possible before the smaller exception

    }
}

package ex_10_For_Loop;

public class Lab109_ForLoop_With_Continue_Even_Number {
    public static void main(String[] args) {

             // if we want print both
        for (int i=0; i<=50; i++){
            if (i%2 == 0){
                System.out.println("Even -> " +i);
                continue;
            }
            System.out.println("Odd -> " +i);
        }
                // we want to print only odd number
        for (int i=0; i<=50; i++){
            if (i%2 == 0){
                continue;
            }
            System.out.println("Odd -> " +i);
        }

                    // if we want to print only Even number
        for (int i=0; i<=50; i++){
            if (i%2 == 0){
                System.out.println("Even -> " +i);
                continue;
            }
        }



    }
}

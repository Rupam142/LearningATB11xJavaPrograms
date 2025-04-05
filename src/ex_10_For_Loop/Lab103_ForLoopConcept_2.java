package ex_10_For_Loop;

public class Lab103_ForLoopConcept_2 {
    public static void main(String[] args) {

//        for (int i = 0; i < 0; i--){
//            System.out.println(i);  // it will not run because condition is false.
//        }
//
//        for (int i = 0; i < -10; i--) {    // it will still not run because condition is false.
//            System.out.println(i);
//        }


        for (int i = 0; i > -10; i--) {    // it will run because condition is true and output will be (0 to -9)
            System.out.println(i);
        }

    }
}

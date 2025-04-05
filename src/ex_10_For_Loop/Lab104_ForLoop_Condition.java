package ex_10_For_Loop;

public class Lab104_ForLoop_Condition {
    public static void main(String[] args) {
        int i = 10;// only initialization(i) part can be out side.
//        boolean c = i > 0;   // this syntax can not be possible
        for (; i>0; i--){        // it will print and output will be (10 to 1)
            System.out.println(i);    // if there will no condition output will be infinite
        }
    }
}

package ex_12_Do_While;

public class Lab121_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0){        // In "While Loop": this will not execute because of false condition.
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a);   // In "Do While": This will execute At_least once.
            a++;
        }while (a < 0);



    }
}

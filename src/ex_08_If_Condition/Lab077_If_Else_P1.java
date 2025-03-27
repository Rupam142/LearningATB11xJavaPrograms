package ex_08_If_Condition;

public class Lab077_If_Else_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);  // this is use for user call.
        if (age > 18){
            System.out.println("Yes, you can go to Goa");
        }else {                                                   // in this code we used CLI options and execute the program
            System.out.println("you can't");
        }

    }
}

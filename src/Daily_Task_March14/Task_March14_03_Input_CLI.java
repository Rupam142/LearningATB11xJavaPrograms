package Daily_Task_March14;

public class Task_March14_03_Input_CLI {
    public static void main(String[] args) {
        // Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a);
        System.out.println(b);

        String max = (a > b) ? (a + " " + "is greater then" + " " + b) : (b + " " + "is greater then" + " " + a);

        System.out.println(max);


        // if(a > b){
        // System.out.println(a + " " + "is greater then" + " " + b);
        // }

        // else{
        // System.out.println(b + " " + "is greater then" + " " + a);
        // }


    }
}

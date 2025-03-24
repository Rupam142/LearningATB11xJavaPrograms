package Daily_Task;

public class Task_March13_GradeCalculator {

//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);       //add scanner object to take user input
//
//        System.out.println("Enter your Score: ");
//
//    }


    public static void main(String[] args) {

        String score = args[0];
        System.out.println(score);  //output will be 65 or 25 or 45 whatever we put in to the CLI.
        System.out.println(score instanceof String);

        int score1 = Integer.parseInt(args[0]);

        String result = (score1 >= 90) ? "Grade = A" : (score1 >= 80) ? "Grade = B" : (score1 >= 70) ? "Grade = C" : (score1 >= 60) ? "Grade = D" : (score1 >= 50) ? "Grade = E" : "F";
        System.out.println(result);
    }



}

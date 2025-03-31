package Daily_Task_March14;

import java.util.Scanner;

public class Task_March14_Triangle_Classifier_HR {
    public static void main(String[] args) {


        //int t1 = Integer.parseInt(args[0]);
        //int t2 = Integer.parseInt(args[1]);
        //int t3 = Integer.parseInt(args[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the side2");
        int side2 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the side3");
        int side3 = scanner2.nextInt();



        if(side1 <= 0 || side2 <= 0 || side3 <= 0)
            System.out.println("This is not a triangle");
        System.exit(0);


        if(side1+side2 <= side3 || side2+side3 <= side1 || side1+side3 <= side2)
            System.out.println("This is not a triangle");
        System.exit(0);



        if(side1 == side2 && side2 == side3)
            System.out.println("this triangle is equilateral");

        else if (side1 == side2 || side2 == side3 || side1 == side3) {

            System.out.println("This is isosceles triangle ");
        }

        else {
            System.out.println("Scalene");
        }

        scanner.close();


    }



}

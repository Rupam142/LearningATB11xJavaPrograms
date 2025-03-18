package ex_02_Java_Basics_Part2;

public class Lab020_PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("you variable is %d",a);
        //%d -> int,byte,long,short, -data type
        //%s -> String
        //%f -> float,double
        //%b -> boolean
        int b = 20;
        System.out.println("--");
        System.out.printf("%d+%d",a,b);

    }
}

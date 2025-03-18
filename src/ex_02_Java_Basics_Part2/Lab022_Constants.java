package ex_02_Java_Basics_Part2;

public class Lab022_Constants {
    public static void main(String[] args) {
        final int a = 10;
         //a = 20;  // a=20; not possible to change the value because "final is already mentioned".

        //Where we can use "final"
        final float PI = 3.14f;   //-->Here can use "final", where no one can change the value.
        //PI = 90;   --> never can change "PI" value.
    }
}

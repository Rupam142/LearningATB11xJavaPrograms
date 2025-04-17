package ex_30_Exceptions;

public class Lab217_Try_Catch {
    public static void main(String[] args) {
        int a = 0;   // declaring a variable a and giving it the value 1.
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("hello java div by zero");
        }
        System.out.println(a);
    }
}

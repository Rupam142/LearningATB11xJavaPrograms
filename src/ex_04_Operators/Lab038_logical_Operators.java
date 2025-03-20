package ex_04_Operators;

public class Lab038_logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        boolean b = true;
        System.out.println(!!b);


        boolean c = true || false;    // here || is OR Gate sign
        System.out.println(c);        //  0 0 = 0
                                      //  0 1 = 1
                                      //  1 0 = 1  in this syntax ,this rule is working.
                                      //  1 1 = 1
    }
}

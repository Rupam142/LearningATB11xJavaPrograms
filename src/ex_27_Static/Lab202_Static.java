package ex_27_Static;

public class Lab202_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        ref1.displayValue();
        //System.out.println(ref1.b);
        System.out.println(A.b);  // not needed reference , need class which is 'A'
        A.b = 45;  // now the static value is 45, so it will print accordingly


        System.out.println("------");

        A ref2 = new A(20);
        ref2.displayValue();
        //System.out.println(ref2.b);
        System.out.println(A.b);
    }


}

class A{
    //int a = 10;  // This is non-static. It is also called Instance variable / properties / attribute / field
    int a;
    static int b = 20;

    A(int a){
        this.a = a;     // here 'this' is parameterized constructor.
    }

    void displayValue(){
        System.out.println(this.a);
    }


}

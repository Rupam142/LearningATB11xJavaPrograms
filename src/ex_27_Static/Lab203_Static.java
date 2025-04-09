package ex_27_Static;

public class Lab203_Static {
    public static void main(String[] args) {
        B.commonToAll();
        System.out.println(B.b);
        //B.display();   // without creating an object, can't call the display function
        B b_ref = new B();  // if we create by using b_ref, then only call the display function
        b_ref.display();    // // if we create by using b_ref, then only call the display function
        System.out.println(b_ref.a);

    }

}


class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }

    int a = 10;   // this is non-static
    static int b = 10;   // this is static

    void display(){
        System.out.println(b);
        System.out.println("Non-static");
    }

    static void commonToAll(){
        //System.out.println(a);   // IQ:you can not call or use the instance variable in the static method.
                                   // IQ: can't use non-static in static function.
        // System.out.println(this.a);  // same as previous
        System.out.println("static F(n)");
    }

//    static class C{
//        // we can have a static class also but not usefull
//    }



}


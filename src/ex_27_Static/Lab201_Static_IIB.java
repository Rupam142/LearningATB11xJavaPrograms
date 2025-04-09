package ex_27_Static;

public class Lab201_Static_IIB {
    public static void main(String[] args) {
        P1 a1 = new P1();
        P1 a2 = new P1();
        P1 a3 = new P1();

        // IIB will be called based on the objects.
        // SIB will be called based on the Class.
        // we create unlimited no. of objects
        // If we create multiple objects, class is loaded only once.
        // If we loaded the class we can create unlimited no. of objects.
        // If IIB, DC and SIB will be there and object will create the first 'Static' will print first the IIB and the DC
        // Here IIB will print 3 times, static will`print only 1 time and DC will also print 3 time.

    }
}

class P1{
    {
        System.out.println("IIB");   // IIB: Instance initialization Block. IIB will call unlimited .
    }

    P1(){
        System.out.println("DC");   // DC: Default constructor
    }

    static {
        System.out.println("SIB");   // SIB: Static initialization Block. Static will only call once.
    }


}

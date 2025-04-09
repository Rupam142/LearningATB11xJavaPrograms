package ex_27_Static;

public class Lab200_Static_IIB {
    public static void main(String[] args) {
        P a = new P();
        // If IIB, DC and SIB will be there and object will create the first 'Static' will print first the IIB and the DC

    }
}

class P{
    {
        System.out.println("IIB");   // IIB: Instance initialization Block. IIB will call unlimited .
    }

    P(){
        System.out.println("DC");   // DC: Default constructor
    }

    static {
        System.out.println("SIB");   // SIB: Static initialization Block. Static will only call once.
    }


}

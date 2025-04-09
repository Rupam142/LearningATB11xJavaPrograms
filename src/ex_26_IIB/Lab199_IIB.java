package ex_26_IIB;

public class Lab199_IIB {

    // ...
    // IIB
    // Instance initialization Block
    // I will be executed when object is created
    // ...

    public static void main(String[] args) {
        A1 a = new A1();   // step 2: then create object inside the main method.It is Object creation
        //A a;    // IIB will not called because object is not created
        //new A();   // IIB will called because object is created

    }

}

class A1{     // step 1 : first make a class
    A1(){
        System.out.println("DC");  // this is look like a constructor. Default constructor can have only one but we can have unlimited IIBs.
                                   // we can use constructor or IIB at once.
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created.");  // IIB always print first, IIB are the first one who are called when ever an object is created. then print else.
        // We generally use IIB:
        // 1. mysql connection
        // read a csv(Comma separated value) file, xlsx file.
        // read json, xml
        // read a text file or env file
    }

    {
        System.out.println("Hi, I am IIB 2");  // We can have unlimited IIBs.
    }

    {
        System.out.println("Hi, I am IIB 3");  // We can have unlimited IIBs.
    }


}


// Where IIB can ?
// IIB can use , if you want to execute or call something when object is created.


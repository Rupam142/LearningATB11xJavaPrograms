package ex_30_Exceptions;

import java.io.FileInputStream;

public class Lab214_Exceptions_Checked_Example {
    public static void main(String[] args) {
         // Checked Exception Example
        //FileInputStream fileInputStream = new FileInputStream("C://testdata.txt"); // it will gives you error because JVM knows that
        // there is some issue with this file because 'C:' drive(or this kind od path)is not exist in the mac.
    }
}

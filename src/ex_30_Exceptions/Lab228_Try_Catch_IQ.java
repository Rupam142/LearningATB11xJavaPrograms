package ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab228_Try_Catch_IQ {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));  // checked Exception, Error: C:\abc.txt (The system cannot find the file specified)
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

package ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab229_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("c://a.log");
    }
}
 
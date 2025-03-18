package ex_02_Java_Basics_Part2;

public class Lab019_Byte {

    public static void main(String[] args) {
        int age = 78;
        byte age1 = 78; //max human age is less than 128 and byte can store -128 yo 127 value so, we can use "byte" instead of "int".
                        //JVM will convert the age value in binary number 00001010 - 8 Bits can max 127 value.
    }
}

package ex_05_Type_Casting;

public class Lab058_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        // int total = course+GST; //Narrowing - Implicit

        int total1 = course+(int)GST;  // Narrowing - Explicit
        System.out.println(total1);


        float total2 = course+GST;     //Widening - auto - Implicit
        System.out.println(total2);
                //OR
        float total3 = (float)course+GST;  // Widening - Explicit
        System.out.println(total3);

    }
}

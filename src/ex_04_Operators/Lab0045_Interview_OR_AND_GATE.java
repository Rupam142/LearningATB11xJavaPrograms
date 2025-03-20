package ex_04_Operators;

public class Lab0045_Interview_OR_AND_GATE {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > -> true
        // B -> balaji_salary < 5 -> 12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}

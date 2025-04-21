package Daily_Task;

public class Task_19April_Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using different versions of add()
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));      // 2 integer version
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));   // 3 integer version
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));   // 2 double version
    }
}

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

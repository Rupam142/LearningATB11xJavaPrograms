package Daily_Task;

public class Task_19April_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Creating object of Dog

        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Defined in Dog
    }
}

    // Parent Class
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }

        void sleep() {
            System.out.println("This animal sleeps.");
        }
    }

    // Child Class
    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }





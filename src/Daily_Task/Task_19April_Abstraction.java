package Daily_Task;

public class Task_19April_Abstraction {
    public static void main(String[] args) {
        // Creating objects of Car and Bike
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Calling the start method for both
        myCar.start();  // The car is starting.
        myBike.start(); // The bike is starting.

        // Calling the stop method (common to all vehicles)
        myCar.stop();   // The vehicle has stopped.
        myBike.stop();  // The vehicle has stopped.
    }

}

// Abstract Class
abstract class Vehicle {
    // Abstract method (no implementation)
    abstract void start();

    // Concrete method (with implementation)
    void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Implementing the abstract method
    void start() {
        System.out.println("The car is starting.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    // Implementing the abstract method
    void start() {
        System.out.println("The bike is starting.");
    }
}

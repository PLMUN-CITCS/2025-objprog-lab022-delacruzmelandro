// Car class definition
class Car {
    // Attributes (Instance Variables)
    String make;
    String model;
    int year;

    // Constructor to initialize the car attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to run the program
public class CarDemo {
    public static void main(String[] args) {
        // Creating an object of the Car class using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Calling the method to display car details
        myCar.displayInfo();
    }
}

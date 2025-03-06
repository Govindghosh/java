package objectOrientedPrograming.properties.polymorphism;

public class EncapsulationAndAbstraction {
    // Encapsulation and Abstraction Example in Java

    // Encapsulation: Wrapping data (variables) and code (methods) together in a single unit (class)
    // and restricting direct access to some details using access modifiers (private, public, etc.)
    static class Person {
        private String name; // Private variable (data hiding)
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Public getters and setters to access private variables (Encapsulation)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age must be positive!");
            }
        }
    }

    // Abstraction: Hiding implementation details and showing only necessary functionalities.
    // Abstract class defining a blueprint for different types of vehicles.
    abstract static class Vehicle {
        abstract void start(); // Abstract method (no implementation)

        void stop() { // Concrete method (has implementation)
            System.out.println("Vehicle is stopping...");
        }
    }

    // Concrete class implementing the abstract class
    static class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car is starting with key ignition...");
        }
    }

    // Main class with the correct `main` method
    public static void main(String[] args) {
        // Encapsulation Example
        Person person = new Person("John", 25);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
        person.setAge(30);
        System.out.println("Updated Age: " + person.getAge());

        // Abstraction Example
        Vehicle myCar = new Car();
        myCar.start(); // Calls implemented method in Car
        myCar.stop(); // Calls inherited method from Vehicle
    }
}

/*
Differences between Encapsulation and Abstraction:

1. **Encapsulation**:
   - Focuses on data hiding by making variables private and providing public getter/setter methods.
   - Protects object integrity by restricting direct access to data.
   - Example: Using private fields with getter and setter methods in the `Person` class.

2. **Abstraction**:
   - Hides implementation details and only exposes essential functionalities.
   - Achieved using abstract classes and interfaces.
   - Example: The `Vehicle` class with an abstract method `start()` that is implemented in the `Car` class.
*/

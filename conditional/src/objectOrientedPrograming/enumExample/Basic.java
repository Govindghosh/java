package objectOrientedPrograming.enumExample;

public class Basic {

    // Enum named Week implementing the interface A
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // These are enum constants (fixed values)
        // Enums are public, static, and final by default
        // Since enums are final, we cannot create child enums (no inheritance)
        // Internally, this acts like: public static final Week Monday = new Week();

        // Enum Constructor
        Week() {
            System.out.println("Constructor called for " + this);
        }
        // The constructor is called once for each enum constant when they are accessed for the first time.

        // Implementing the hello() method from the interface A
        // num can implement interface as they wont
        @Override
        public void hello() {
            System.out.println("Hey, how are you?");
        }

        // Example of an additional method in an enum (not used in this example)
        void display() {
            System.out.println("This is a day: " + this);
        }

        // Important Note:
        // Enum constructors are private or default (package-private) by design.
        // You cannot create new enum objects using 'new'.
    }

    // Main method where the program starts executing
    public static void main(String[] args) {

        // Declaring a variable of enum type Week
        Week week = Week.Monday; // Assigning Monday to the variable
        week.hello(); // Calling the hello() method, which prints a message

        // Using valueOf() to convert a string to an enum constant
        System.out.println("Using valueOf(): " + Week.valueOf("Monday"));
        // It finds the enum constant with the given name (case-sensitive).
        // If the name doesn't match, it throws an IllegalArgumentException.

        // Using values() to iterate over all enum constants
        System.out.println("All days of the week:");
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        // Week.values() returns an array of all enum constants.

        // Using ordinal() to get the position of an enum constant
        System.out.println("Ordinal of " + week + " is: " + week.ordinal());
        // Ordinal starts from 0. For example:
        // Monday → 0, Tuesday → 1, Wednesday → 2, and so on.
    }
}
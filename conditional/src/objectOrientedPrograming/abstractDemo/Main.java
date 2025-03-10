package objectOrientedPrograming.abstractDemo;

// The Main class is the entry point of the program
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Son and passing age as an argument
        Son son = new Son(30);

        // Calling methods of the Son class
        son.career();   // Prints career choice
        son.partner();  // Prints partner preference

        // Accessing the age variable directly
        System.out.println("Son's age: " + son.age);

        // Creating an instance of Daughter and passing age as an argument
        Daughter daughter = new Daughter(23);

        // Calling methods of the Daughter class
        daughter.career();
        daughter.partner();

        // Accessing the age variable directly
        System.out.println("Daughter's age: " + daughter.age);

        // ❌ Cannot create an object of an abstract class (Uncommenting this will cause an error)
        // Parent mom = new Parent();
        // ✅ Creating an anonymous subclass of the abstract class Parent
        Parent mom = new Parent(50) {
            @Override
            void career() {
                System.out.println("I have my own career path.");
            }

            @Override
            void partner() {
                System.out.println("I have my own partner preference.");
            }
        }; // **Added semicolon here to end the statement**

        // Calling methods on the anonymous class instance
        mom.career();
        mom.partner();
    }
}

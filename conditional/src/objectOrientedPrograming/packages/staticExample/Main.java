package objectOrientedPrograming.packages.staticExample;

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Human class
        Human raghav = new Human(24, "Raghav", true, 100000);
        Human govind = new Human(25, "Govind", true, 100000);
        Human tannu = new Human(24, "Tannu", true, 100000);

        // ❌ Incorrect way to access static variables (Not recommended)
        System.out.println(govind.population);
        System.out.println(tannu.population);

        // ✅ Correct way to access static variables (Recommended)
        System.out.println(Human.population); // Static variables belong to the class, not objects

        // ❌ Non-static method 'greeting()' cannot be referenced from a static context
        // greeting(); // This will cause an error

        // ✅ Calling non-static method properly using an instance
        Main obj = new Main();
        obj.greeting();
    }

    // ✅ Static method: Belongs to the class, not instances
    static void fun() {
        // ❌ Cannot directly call a non-static method from a static context
        // greeting(); // This will cause an error

        // ✅ Correct way: Create an instance to access non-static methods
        Main obj = new Main();
        obj.greeting();
    }

    // ✅ Non-static method: Requires an instance to be called
    void greeting() {
        System.out.println("Hello World");
    }
}

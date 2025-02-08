package objectOrientedPrograming.packages.singleton;

public class Singleton {
    // Private constructor to prevent creating multiple instances
    private Singleton() { }

    // Static variable to store the single instance
    private static Singleton instance;

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        // If no instance exists, create one
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

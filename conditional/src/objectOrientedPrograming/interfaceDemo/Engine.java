package objectOrientedPrograming.interfaceDemo;

// ✅ Interface defining engine behavior
public interface Engine {

    // ✅ Constants (public, static, and final by default)
    int MAX_CAR_SPEED = 300;
    int MAX_BIKE_SPEED = 200;
    String ENGINE_TYPE = "Combustion Engine";

    // ✅ Abstract methods (Must be implemented by classes)
    void start();
    void stop();
    void accelerate();

    // ✅ Default method (Can be overridden but not mandatory)
    default void fuelEfficiency() {
        System.out.println("This engine has decent fuel efficiency.");
    }

    // ✅ Static method (Belongs to interface, cannot be overridden)
    static void engineInfo() {
        System.out.println("All engines convert energy into motion.");
    }
}

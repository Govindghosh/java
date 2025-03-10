package objectOrientedPrograming.interfaceDemo;

// ✅ Implements Engine and Brake for Bikes
public class Bike implements Engine, Brake {

    @Override
    public void start() {
        System.out.println("🏍️ Bike engine starting...");
    }

    @Override
    public void stop() {
        System.out.println("🛑 Bike engine stopping...");
    }

    @Override
    public void accelerate() {
        System.out.println("🏎️ Bike is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("🛑 Bike is braking using disc brakes.");
    }

    // ✅ Overriding default method
    @Override
    public void fuelEfficiency() {
        System.out.println("🏍️ Bike has high fuel efficiency.");
    }

    // ✅ Display engine info
    public void displayBikeInfo() {
        System.out.println("Bike Engine Type: " + ENGINE_TYPE);
        System.out.println("Bike Max Speed: " + MAX_BIKE_SPEED + " km/h");
    }
}

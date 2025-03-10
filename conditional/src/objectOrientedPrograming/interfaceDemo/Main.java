package objectOrientedPrograming.interfaceDemo;

public class Main {
    public static void main(String[] args) {
        // ✅ Using interface reference for Car
        Car car = new Car();
        car.start();
        car.accelerate();
        car.brake(); // Car braking method
        car.stop(); // Stops car engine
        car.fuelEfficiency(); // Overridden method in Car
        car.displayCarInfo(); // Accessing Car-specific method

        // ✅ Car media player functionality
        car.play();  // Starts car media player
        car.pause(); // Pauses car media player
        car.setVolume(50); // Sets volume to 50
        car.stopMedia(); // Stops media player (to avoid stop() conflict)

        System.out.println("----------------------------");

        // ✅ Using interface reference for Bike
        Bike bike = new Bike();
        bike.start();
        bike.accelerate();
        bike.brake(); // Bike braking method
        bike.stop(); // Stops bike engine
        bike.fuelEfficiency(); // Overridden method in Bike
        bike.displayBikeInfo(); // Accessing Bike-specific method

        System.out.println("----------------------------");

        // ✅ Calling static method from the interface
        Engine.engineInfo();

        // ✅ Calling static method from MediaPlayer
        MediaPlayer.supportedFormats();
    }
}


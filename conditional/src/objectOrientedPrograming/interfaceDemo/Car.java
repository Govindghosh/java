package objectOrientedPrograming.interfaceDemo;

// ✅ Implements Engine, Brake, and MediaPlayer for Cars
public class Car implements Engine, Brake, MediaPlayer {

    @Override
    public void start() {
        System.out.println("🚗 Car engine starting...");
    }

    // ✅ Implementing Engine's stop() method
    @Override
    public void stop() {
        System.out.println("🛑 Car engine stopping...");
    }

    @Override
    public void accelerate() {
        System.out.println("🚀 Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("🛑 Car is braking using ABS.");
    }

    // ✅ Overriding default method from Engine
    @Override
    public void fuelEfficiency() {
        System.out.println("🚗 Car has moderate fuel efficiency.");
    }

    // ✅ Implementing MediaPlayer methods
    @Override
    public void play() {
        System.out.println("🎵 Car media system playing music...");
    }

    @Override
    public void pause() {
        System.out.println("⏸️ Car media system paused.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.println("⚠️ Volume out of range. Set between " + MIN_VOLUME + " and " + MAX_VOLUME);
        } else {
            System.out.println("🔊 Volume set to: " + volume);
        }
    }

    // ✅ Resolving "stop()" conflict: Using a separate method for MediaPlayer.stop()
    public void stopMedia() {
        System.out.println("⏹️ Car media system stopped.");
    }

    // ✅ Calling the default method from MediaPlayer
    @Override
    public void displayInfo() {
        MediaPlayer.super.displayInfo();
        System.out.println("🚗 Car has a built-in media player.");
    }

    // ✅ Display engine info
    public void displayCarInfo() {
        System.out.println("Car Engine Type: " + Engine.ENGINE_TYPE);
        System.out.println("Car Max Speed: " + Engine.MAX_CAR_SPEED + " km/h");
    }
}

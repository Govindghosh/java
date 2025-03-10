package objectOrientedPrograming.interfaceDemo;

// ✅ Interface defining media player behavior
public interface MediaPlayer {

    // ✅ Constants (public, static, and final by default)
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // ✅ Abstract methods (Must be implemented by classes)
    void play();
    void stop();
    void pause();  // 🎵 Added missing method
    void setVolume(int volume);

    // ✅ Default method (Can be overridden but not mandatory)
    default void displayInfo() {
        System.out.println("🎵 This is a media player.");
    }

    // ✅ Static method (Belongs to the interface, cannot be overridden)
    static void supportedFormats() {
        System.out.println("Supported formats: MP3, WAV, AAC, FLAC.");
    }
}

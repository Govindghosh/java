package objectOrientedPrograming.packages.singleton;

public class Main {
    public static void main(String[] args) {
        // Get Singleton instances
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        // all 3 ref var are pointing to just one obj

        // Checking if all instances are the same
        System.out.println(singleton == singleton1); // true
        System.out.println(singleton1 == singleton2); // true
    }
}

package objectOrientedPrograming.properties.inheritance;

public class Box {
    double len;
    double hei;
    double width;

    // Static method to demonstrate class-level behavior
    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    // Constructor to initialize Box with specific dimensions
    public Box(double len, double width, double hei) {
        this.len = len;
        this.width = width;
        this.hei = hei;
    }

    // Default constructor initializes to -1 (indicating an uninitialized box)
    public Box() {
        this.len = -1;
        this.hei = -1;
        this.width = -1;
    }

    // Constructor for a cube-like Box (all sides equal)
    public Box(double side) {
        this.len = side;
        this.hei = side;
        this.width = side;
    }

    // Copy constructor to create a new Box with the same dimensions as an existing one
    public Box(Box old) {
        this.len = old.len;
        this.hei = old.hei;
        this.width = old.width;
    }
}


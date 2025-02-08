package objectOrientedPrograming.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Calling the parameterized constructor
        Box box1 = new Box(10, 20, 30);
        System.out.println("Box1 dimensions: " + box1.len + " x " + box1.width + " x " + box1.hei);

        // Calling the default constructor
        Box box2 = new Box();
        System.out.println("Box2 dimensions (default): " + box2.len + " x " + box2.width + " x " + box2.hei);

        // Calling the constructor with a single side (for cube-like objects)
        Box box3 = new Box(15);
        System.out.println("Box3 dimensions (cube): " + box3.len + " x " + box3.width + " x " + box3.hei);

        // Calling the copy constructor
        Box box4 = new Box(box1);
        System.out.println("Box4 dimensions (copied from box1): " + box4.len + " x " + box4.width + " x " + box4.hei);

        // Calling the static greeting method
        Box.greeting();
    }
}


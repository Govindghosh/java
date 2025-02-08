package objectOrientedPrograming.packages.staticExample;

// This is a demo to show initialization of static variables using a static block
public class StaticBlock {
    // Static variable
    static int a;
    static int b;

    // Static block - runs only once when the class is loaded
    static {
        System.out.println("Static block executed!");
        a = 10;
        b = 20;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
              // Accessing static variables
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}

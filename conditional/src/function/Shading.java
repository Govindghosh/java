package function;

public class Shading {
    static int x = 90; // i can use under the shading scope
    public static void main(String[] args) {

        System.out.println("x value" + x);
        int x ; // declaration x and doing shading
        // System.out.println("x value" + x); // give error because x in main fn declare but not initialised
        x = 40; // now x initialised
        System.out.println("x value" + x);
        fun(); // fun function call

    }
    static void fun(){
        System.out.println("x value" + x);
    }
}

package objectOrientedPrograming.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
        Shapes square1 = new Square();
        square1.area();
    }
}

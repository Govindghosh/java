package objectOrientedPrograming.properties.inheritance;

// BoxWeigh class extends the Box class, meaning it inherits all properties and methods of Box
public class BoxWeigh extends Box {
    double weigh; // Additional property specific to BoxWeigh

    // Constructor that initializes only the weight property
    public BoxWeigh(double weight) {
        this.weigh = weight; // Assigns the weight value to the weigh variable
    }

    public BoxWeigh(double len, double weigh) {
        this.weigh = weigh;
        //this.len = len; // you can not use like if the len is private you can do in same file
    }

    // Constructor that initializes both Box (parent class) and BoxWeigh properties
    public BoxWeigh(double len, double width, double hei, double weigh) {
        super(len, width, hei); // Calls the constructor of the parent class (Box) to initialize its properties
        // This is necessary because the parent class may not have a default constructor.
        this.weigh = weigh; // Initializes the weight property of the BoxWeigh class
    }

    public BoxWeigh() {

    }


    public String toString() {
        return "BoxWeigh [" +
                //"Length=" + len + // you can not use like if the len is private you can do in same file
                ", Width=" + width
                + ", Height=" + hei
                + ", Weight=" + weigh + "]";
    }
}

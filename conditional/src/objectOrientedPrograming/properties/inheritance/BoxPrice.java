package objectOrientedPrograming.properties.inheritance;

public class BoxPrice extends BoxWeigh{
    double price;

    public BoxPrice(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public BoxPrice(double price) {
        super();
        this.price = price;
    }

    public BoxPrice(double len, double width, double hei, double weigh, double price) {
        super(len, width, hei, weigh);
        this.price = price;
    }
}

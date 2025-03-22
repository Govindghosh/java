package objectOrientedPrograming.cloning;

// Class demonstrating Shallow Copy and Deep Copy in Java
public class Human implements Cloneable {
    int age;
    String name;

    // Deep Copy Constructor - Creates a separate copy of object data
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // Constructor to initialize Human object
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Displaying object data
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    // Shallow Copy using clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
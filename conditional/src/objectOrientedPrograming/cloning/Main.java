// Main class to demonstrate Shallow and Deep Copy
package objectOrientedPrograming.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating original object
        Human person0 = new Human(23, "Govind");

        // Performing Deep Copy using constructor
        Human twin0 = new Human(person0);
        System.out.println("Deep Copy (Using Constructor): " + twin0);

        // Displaying original object
        System.out.println("Original Object: " + person0);

        // Performing Shallow Copy using clone() method
        Human twin1 = (Human) person0.clone();
        System.out.println("Shallow Copy (Using Clone): " + twin1);
    }
}
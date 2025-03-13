package objectOrientedPrograming.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human person0 = new Human(23, "Govind");
        Human twin0 = new Human(person0);
        System.out.println(twin0.toString());
        System.out.println(person0.toString());
        Human twin1 = (Human) person0.clone();
        System.out.println(twin1.toString());
    }

}

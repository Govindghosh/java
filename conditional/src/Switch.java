import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give me Fruit name : ");
        String fruit = in.next();
        switch (fruit) {
            case "Apple ":
                System.out.println(fruit + " is a Crisp");
                break;
            case "Banana":
                System.out.println(fruit + " is a Energizing");
                break;
            case "Orange":
                System.out.println(fruit + " is a Juicy");
                break;
            case  "Mango":
                System.out.println(fruit + " is a Sweet");
                break;
            case "Grapes":
                System.out.println(fruit + " is a Tangy");
                break;
            case "Pineapple":
                System.out.println(fruit + " is a Tropical");
                break;
            case "Strawberry":
                System.out.println(fruit + " is a Fragrant");
                break;
            case "Watermelon":
                System.out.println(fruit + " is a Refreshing");
                break;
            case "Kiwi":
                System.out.println(fruit + " is a Zesty");
                break;
            case "Blueberry":
                System.out.println(fruit + " is a Antioxidant");
                break;
            default:
                System.out.println(fruit + " nice fruit");
        }
    }
}

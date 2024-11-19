import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // if loop
        System.out.println("example if loop");
        System.out.print("Enter a value :");
        int a = input.nextInt();
        System.out.print("Enter B value :");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("True");
        }
        System.out.println("False");

       // While loop example
        System.out.println("Example of while loop");
        System.out.print("Give one integer for the multiplication table: ");
        int count = input.nextInt();
        int multi = 1;

        while (multi <= 10) { // Fixed the condition to include 10
            int table = count * multi;
            System.out.println(count + " x " + multi + " = " + table); // More descriptive output
            multi++;
        }

        // For loop example
        System.out.println("Example of for loop");
        System.out.print("Give one integer for the multiplication table: ");
        int forTable = input.nextInt();
        System.out.println("Enter the starting multiplier: ");
        int multiplayFrom = input.nextInt();
        System.out.println("Enter the ending multiplier: ");
        int multiplayTo = input.nextInt();

        for (int i = multiplayFrom; i <= multiplayTo; i++) {
            int forTableSum = forTable * i;
            System.out.println(forTable + " x " + i + " = " + forTableSum); // More descriptive output
        }

        // Close the scanner to avoid resource leaks
        input.close();
    }
}
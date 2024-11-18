import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value :");
        int a = input.nextInt();
        System.out.print("Enter B value :");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("True");
        }
        System.out.println("False");
    }
}

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Welcome to our roll number printer");
        Scanner input = new Scanner(System.in);

        // Reading roll number
        System.out.print("Please Enter your roll number: ");
        int rollno = input.nextInt();
        input.nextLine(); // Clear the newline character left by nextInt()
        System.out.println("Your Roll number is " + rollno);

        // Reading first name
        System.out.println("Please enter your name: ");
        String firstName = input.nextLine();
        System.out.println("Thank you for mentioning your name.");

        // Reading surname
        System.out.println("Please enter your surname: ");
        String surname = input.nextLine();
        System.out.println("Thank you for mentioning your surname.");

        // Printing full name
        System.out.println("Your full name is " + firstName + " " + surname);

        // Primitives print
        System.out.println("please write a integers");
        int intNumber = input.nextInt();
        System.out.println("Please write a Long");
        long longNumber = input.nextLong();
        System.out.println("Please write a Float");
        float floatNumber = input.nextFloat();
        System.out.println("please write a double");
        double doubleNumber = input.nextDouble();
        System.out.println("please write a char");
        char charIs = input.next().charAt(0);
        System.out.println("your int is " + intNumber +
                ", long Number is " + longNumber +
                ", float number is " + floatNumber +
                ", double number is " + doubleNumber +
                ", chat is " + charIs);
    }
}

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Welcome to our roll number printer");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your Roll number is " + rollno);
        //String
        Scanner inputFirstName = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String firstName = inputFirstName.nextLine();
        Scanner inputSurname = new Scanner(System.in);
        System.out.print("Please enter your surname: ");
        String surname = inputSurname.nextLine();
        System.out.println("your name is " + firstName + surname);
    }
}

package function;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your name: ");
            String name = in.nextLine().trim(); // Read name and trim whitespace

            System.out.print("Please enter your number: ");
            long number;
            try {
                number = Long.parseLong(in.nextLine().trim()); // Parse number as long
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            System.out.print("Please enter your age: ");
            int age;
            try {
                age = Integer.parseInt(in.nextLine().trim()); // Parse age as int
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please try again.");
                continue;
            }

            if (name.isEmpty()) {
                System.out.println("Your name cannot be empty. Please try again.");
            } else {
                String detail = myGreet(name, number, age);
                System.out.println(detail);
                break; // Exit the loop after successful input
            }
        }

        in.close(); // Close the scanner
    }

    static String myGreet(String name, long number, int age) {
        return "Hello " + name + ", your number is " + number + " and your age is " + age + ".";
    }
}

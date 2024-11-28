import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long ans = 0;

        while (true) {
            System.out.print("Give me an operator (+, -, *, /, %, x to exit): ");
            char op = in.next().trim().charAt(0);

            // Exit condition
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator.");
                break;
            }

            // Check for valid operators
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Please give me the 1st number: ");
                long num1 = in.nextLong();
                System.out.print("Please give me the 2nd number: ");
                long num2 = in.nextLong();

                // Perform operations
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '%') {
                    ans = num1 % num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }

                System.out.println("Your answer is: " + ans);
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
        }

        in.close();
    }
}

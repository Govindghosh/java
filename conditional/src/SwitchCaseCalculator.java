import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res = 0;
        while(true){
            System.out.print("Give me one operator (+, -, *, /, %, x to exit): ");
            char op = in.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                System.out.println("thank you to Exiting");
                break;
            }
            if (op == '*' || op == '+' || op == '-' || op == '/' || op == '%') {
                System.out.print("Please provide a 1st number : ");
                long num1 = in.nextLong();
                System.out.print("Please provide a 2nd Number : ");
                long num2 = in.nextLong();
                switch (op) {
                    case '+':
                        res = num1 + num2;
                        break;
                    case '-':
                        res = num1 - num2;
                        break;
                    case '*':
                        res = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            res = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        break;
                    case '%':
                        if (num2 != 0) {
                            res = num1 % num2;
                        } else {
                            System.out.println("Error: Modulo by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("default Invalid operator. Please try again.");
                        continue;
                }
                System.out.println("Your answer is " + res);
            }else {
                System.out.println("Invalid operator. Please try again.");
            }
        }
        in.close();
    }
}

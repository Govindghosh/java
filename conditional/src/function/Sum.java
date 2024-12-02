package function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Single Scanner for all methods

        // Call the first sum method
        sum(in);

        // Call the second sum method and print the result
        long res = sum2(in);
        System.out.println("The result from sum2 is: " + res);

        in.close(); // Close Scanner after all operations
    }

    static void sum(Scanner in) {
        System.out.println("Executing Sum1");
        int num1, num2, ans;

        System.out.print("Please provide the 1st number to add: ");
        num1 = in.nextInt();

        System.out.print("Please provide the 2nd number: ");
        num2 = in.nextInt();

        ans = num1 + num2;
        System.out.println("The sum is: " + ans);
    }

    static long sum2(Scanner in) {
        System.out.println("Executing Sum2");
        long num1, num2, ans;

        System.out.print("Please provide the 1st number to add: ");
        num1 = in.nextLong();

        System.out.print("Please provide the 2nd number: ");
        num2 = in.nextLong();

        ans = num1 + num2;
        return ans;
    }
}

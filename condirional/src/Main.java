import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *  Syntax of if Statements
         *  if (boolean expression b/w T or F) {
         *   // body
         *  if ture do this
         * } else {
         *   else do this
         * }
         * */
        // check if statements
        System.out.println("IF ELSE statement");
        Scanner in = new Scanner(System.in);
        System.out.print("Please write your salary : ");
        int salary = in.nextInt();
        System.out.println("your salary is " + salary);
        System.out.print("Please provide a Limit ofter : ");
        int limitOffer = in.nextInt();
        if (salary >= limitOffer) {
            int totalSalary = salary + 2000;
            System.out.println("Your Total salary is " + totalSalary);
        } else {
            int totalSalary = salary + 1000;
            System.out.println("Your Total salary is " + totalSalary);
        }
        // Multiple if-else example
        System.out.println("Multiple if-else example");

        if (salary > limitOffer) {
            // Case: Salary is greater than limitOffer
            int totalSalary = salary + 2000;
            System.out.println("Your Total salary is " + totalSalary);
        } else if (salary < limitOffer) {
            // Case: Salary is less than limitOffer
            int totalSalary = salary + 1000;
            System.out.println("Your Total salary is " + totalSalary);
        } else if (salary > (limitOffer + 10000)) {
            // Case: Salary is greater than limitOffer + 10000
            int totalSalary = salary + 3000;
            System.out.println("Your Total salary is " + totalSalary);
        } else {
            // Default Case: If none of the above conditions are met
            System.out.println("No salary adjustment required.");
        }

    }

}
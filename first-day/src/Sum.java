import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sum of integers
        System.out.println("Number addition");
        System.out.print("please write your 1st number :");
        int num1 = input.nextInt();
        System.out.print("please write your next Number :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Total is :" + sum);

        // long number addition
        System.out.println("Long Number addition");
        System.out.print("Write you number :");
        long num3 = input.nextLong();
        System.out.print("Write you next number :");
        long num4 = input.nextLong();
        long longSum = num3 + num4;
        System.out.println("your total is " + longSum);

        //float addition
        System.out.println("float addition");
        System.out.print("Write a 4byte float :");
        float floatNum1 = input.nextFloat();
        System.out.print("write Next float :");
        float floatNum2 = input.nextFloat();
        float floatSum = floatNum1 + floatNum2;
        System.out.println("you total is " + floatSum);

        //double addition
        System.out.println("double addition");
        System.out.print("write 8byte double :");
        double doubleNum1 = input.nextDouble();
        System.out.print("double next :");
        double doubleNum2 = input.nextDouble();
        double doubleSum = doubleNum1 + doubleNum2;
        System.out.println("you total is " + doubleSum);

        // char addition
        System.out.println("char addition");
        System.out.println("write a 1st char :");
        char char1 = input.next().charAt(0);
        System.out.println("next chat :");
        char char2 = input.next().charAt(0);
        String charSum = String.valueOf(char1) + char2;
        System.out.println("Your concatenated chars are: " + charSum);
    }
}
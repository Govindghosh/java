
package function;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Scope");
        System.out.print("Enter num1 value (int): ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 value (int): ");
        int num2 = in.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Call the swap method
        int[] swapped = swap(num1, num2);
        num1 = swapped[0];
        num2 = swapped[1];

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        // Close the scanner
        in.close();
    }
    //{} function scope num1 and num2' value we do not use another fn example
    //    public int swap(){
//        System.out.println(num1, num2);
//    }
    // showing error
    public static int[] swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        return new int[]{num1, num2};
    }
}

package array;

import java.util.Scanner;

public class FindMaxValueArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[5];
        System.out.print("Please fill the 5-length array:");
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        int maxValue = max(list); // Corrected to return an integer
        System.out.println("The max value is: " + maxValue);
    }

    static int max(int[] list) {
        int maxValue = list[0]; // Assume the first element is the max
        for (int i = 1; i < list.length; i++) {
            if (maxValue < list[i]) {
                maxValue = list[i];
            }
        }
        return maxValue;
    }
}

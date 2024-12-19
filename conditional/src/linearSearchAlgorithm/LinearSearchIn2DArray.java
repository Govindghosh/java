package linearSearchAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("2D Array Linear Search");

        // Define a 2D array with dynamic column sizes
        int[][] arr = new int[3][]; // 3 rows, columns defined dynamically
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter the number of columns for row " + row + ": ");
            int cols = in.nextInt();
            while (cols <= 0) {
                System.out.println("Number of columns cannot be 0 or negative. Please re-enter:");
                cols = in.nextInt();
            }
            arr[row] = new int[cols];
        }

        // Populate the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter value for position [" + row + "][" + col + "]: ");
                arr[row][col] = in.nextInt();
            }
        }

        // Ask for the target element
        System.out.print("Which element do you want to search for? ");
        int target = in.nextInt();

        // Perform linear search
        int[] result = searchIn2DArray(arr, target);

        // Output the result
        if (result[0] != -1) {
            System.out.println("Element found at position: " + Arrays.toString(result));
        } else {
            System.out.println("Element not found in the array.");
        }

        in.close(); // Close the scanner to avoid resource leaks
    }

    // Method to search for an element in a 2D array
    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // Return the position as {row, col}
                }
            }
        }
        return new int[]{-1, -1}; // Return {-1, -1} if the target is not found
    }
}

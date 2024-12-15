package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        System.out.println("Examples of 2D Arrays in Java:");

        // Full matrix initialization
        System.out.println("\n1. Full Initialization for a 3x3 Matrix:");
        int[][] arr1 = new int[3][3];
        arr1[0] = new int[]{1, 2, 3};
        arr1[1] = new int[]{4, 5, 6};
        arr1[2] = new int[]{7, 8, 9};
        System.out.println(Arrays.deepToString(arr1));

        // Jagged array initialization
        System.out.println("\n2. Jagged Array Initialization:");
        int[][] arr2 = new int[3][];
        arr2[0] = new int[]{1, 2};
        arr2[1] = new int[]{3, 4, 5};
        arr2[2] = new int[]{6};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        // Direct initialization
        System.out.println("\n3. Direct Initialization:");
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.deepToString(arr3));

        // Fixed column size with user input
        Scanner in = new Scanner(System.in);
        System.out.println("\n4. Fixed 3x2 Array with User Input:");
        int[][] arr4 = new int[3][2];
        System.out.println("Enter 6 elements for a 3x2 array:");
        for (int row = 0; row < arr4.length; row++) {
            for (int col = 0; col < arr4[row].length; col++) {
                arr4[row][col] = in.nextInt();
            }
        }
        System.out.println("The entered 3x2 array is:");
        System.out.println(Arrays.deepToString(arr4));

        // Dynamic column size with user input
        System.out.println("\n5. Dynamic Columns with User Input:");
        int[][] arr5 = new int[3][];
        for (int row = 0; row < arr5.length; row++) {
            System.out.print("Enter the number of columns for row " + (row + 1) + ": ");
            int cols = in.nextInt();
            if (cols < 0) {
                System.out.println("Invalid input. Columns must be >= 0.");
                return;
            }
            arr5[row] = new int[cols];
        }
        System.out.println("Enter the elements row by row:");
        for (int row = 0; row < arr5.length; row++) {
            for (int col = 0; col < arr5[row].length; col++) {
                arr5[row][col] = in.nextInt();
            }
        }
        System.out.println("The entered jagged array is:");
        System.out.println(Arrays.deepToString(arr5));

        in.close();
    }
}

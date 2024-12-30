package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 6, 40, 35};
        bubble(arr);
        System.out.println("My sorted array is " + Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // Run the loop n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            // Flag to check if the array is already sorted
            boolean swapped = false;
            // Inner loop for comparison
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap items
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping is done, the array is already sorted
            if (!swapped) break;
        }
    }
}

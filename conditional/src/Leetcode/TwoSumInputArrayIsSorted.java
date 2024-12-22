package Leetcode;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target))); // Correctly prints the result as an array
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0; // Pointer to the beginning of the array
        int end = numbers.length - 1; // Pointer to the end of the array

        while (start < end) { // Loop until pointers cross
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                // If the sum equals the target, return the 1-based indices
                return new int[]{start + 1, end + 1};
            } else if (sum > target) {
                // If the sum is too large, decrement the end pointer
                end--;
            } else {
                // If the sum is too small, increment the start pointer
                start++;
            }
        }
        return new int[]{-1, -1}; // This line won't be reached if a solution is guaranteed
    }
}

package Leetcode;
// Cyclic Sort for Missing Number
// https://leetcode.com/problems/missing-number/description/


public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = findMissingNumber(nums);
        System.out.println("Answer is: " + missing);
    }

    static int findMissingNumber(int[] nums) {
        int i = 0;

        // Perform cyclic sort
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Find the missing number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        // If no number is missing, return n
        return nums.length;
    }

    static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}

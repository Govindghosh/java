package Leetcode;
// question https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i]; // Duplicate found
                }
            } else {
                i++;
            }
        }

        // If no duplicate is found (shouldn't happen per problem constraints)
        return -1;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

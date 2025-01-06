package Leetcode;

import java.util.ArrayList;
import java.util.List;

// question https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicate numbers: " + duplicates);
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicatesNumbers = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    // If the number is already at the correct position, it's a duplicate
                    i++;
                }
            } else {
                i++;
            }
        }

        // Collect duplicates
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicatesNumbers.add(nums[j]);
            }
        }

        return duplicatesNumbers;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
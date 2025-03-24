package leetcode;

import java.util.Arrays;

// question https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println("My answer is " + Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = findPosition(nums, target, true);
        int end = findPosition(nums, target, false);
        return new int[]{start, end};
    }

    static int findPosition(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                position = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return position;
    }
}

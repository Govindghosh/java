package Leetcode;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = countRotation(nums);
        System.out.println("My array Rotation Count: " + ans);
    }

    static int countRotation(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}

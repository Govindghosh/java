package leetcode;
// question https://leetcode.com/problems/find-peak-element/description/
//bitonic array
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int ans = findPeakElement(nums);
        System.out.println("My answer is: " + ans);
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Compare mid with mid + 1
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}

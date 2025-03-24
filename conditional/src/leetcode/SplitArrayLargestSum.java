package leetcode;
// question https://leetcode.com/problems/split-array-largest-sum/description/
// answer https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int ans = splitArray(nums, k);
        System.out.println("My answer is: " + ans);
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // Initialize start and end
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // The minimum possible value of the largest subarray sum
            end += nums[i]; // The maximum possible value of the largest subarray sum
        }
        // Binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
            // Determine how many pieces we can split into with this `mid`
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // Start a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            // Adjust search range
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}

package Leetcode;
// question https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// solution https://leetcode.com/problems/find-numbers-with-even-number-of-digits/solutions/6167966/find-numbers-with-even-number-of-digits-mub4g
public class FindNumberWithEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (isEvenDigit(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigit(int num) {
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num /= 10;
        }
        return digitCount % 2 == 0; // Check if the digit count is even
    }
}

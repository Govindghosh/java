package leetcode;
// question https://leetcode.com/problems/valid-perfect-square/description/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num =25;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true;

        int start = 1;
        int end = num / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}

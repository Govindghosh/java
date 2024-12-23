package Leetcode;

// Question: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// solution https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println("My answer is " + ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // `start` might go out of bounds, but `% letters.length` handles the circular condition
        return letters[start % letters.length];
    }
}

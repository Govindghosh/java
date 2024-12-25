package Leetcode;
// question https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peakIndex = findPeak(mountainArr);
        System.out.println("My peak index is: " + peakIndex);
        int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);
        System.out.println("Ascending order target index: " + leftResult);
        int rightResult = binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length - 1, false);
        System.out.println("Descending order target index: " + rightResult);
        int finalResult = (leftResult == -1) ? rightResult : ((rightResult == -1) ? leftResult : Math.min(leftResult, rightResult));
        System.out.println("Final result: " + finalResult);
    }

    static int findPeak(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] < mountainArr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(int[] mountainArr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr[mid];

            if (midValue == target) {
                return mid;
            }
            if (isAscending) {
                if (midValue < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // Descending order
                if (midValue > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

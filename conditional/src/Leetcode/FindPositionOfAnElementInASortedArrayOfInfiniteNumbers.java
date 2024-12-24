package Leetcode;


// question https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FindPositionOfAnElementInASortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        System.out.println("My answer is " + ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (true) {
            try {
                if (arr[end] >= target) {
                    break;
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                end = arr.length - 1;
                break;
            }
        }

        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


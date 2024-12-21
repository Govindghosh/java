package binarySearch;

public class DescendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5, 0, -5, -10, -15, -20, -25, -30, -45};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println("My answer is " + ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target > arr[mid]){
                end = mid -1;
            } else if (target < arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        // if the element not in the arr
        return -1;
    }
}
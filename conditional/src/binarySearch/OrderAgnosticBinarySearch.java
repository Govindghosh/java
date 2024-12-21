package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-45, -30, -25, -20, -15, -10, -5, 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
//        int[] arr = {60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5, 0, -5, -10, -15, -20, -25, -30, -45};
        int target = -45;
        int ans = AgnosticBinarySearch(arr, target);
        System.out.println("My answer is " + ans);
    }
    static int AgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if (arr[start] < arr[end]) {
            int result = ascendingBinarySearch(arr, target, start, end);
            if (result != -1) {
                return result;
            } else {
                return -1;
            }
        } else{
            int result = descendingBinarySearch(arr, target, start, end);
            if (result != -1) {
                return result;
            } else {
                return -1;
            }
        }
    }

    static int descendingBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // Target not found
    }
    static int ascendingBinarySearch(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
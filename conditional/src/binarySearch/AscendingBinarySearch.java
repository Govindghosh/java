package binarySearch;

public class AscendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-45, -30, -25, -20, -15, -10, -5, 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        int target = 60;
        int ans = binarySearch(arr, target);
        System.out.println("My answer is " + ans);
    }
    // return -1 if in array target not found
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    };
}

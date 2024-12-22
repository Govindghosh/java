package binarySearch;

public class CeilingBinarySearchKK {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int target = 1;
        int ans = binarySearchKK(arr,target);
        System.out.println("My answer is " + ans);
    }
    static int binarySearchKK(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

}

package binarySearch;

public class FloorBinarySearchKK {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int target = 8;
        int ans = binarySearchKK(arr, target);
        System.out.println("My answer is " + ans);
    }
    static int binarySearchKK(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = end+1;
            } else if (arr[mid] == mid) {
                return mid;
            }else{
                end = mid -1;
            }
        }
        return end;
    }
}

package linearSearchAlgorithm;

import java.util.Scanner;

public class SearchInRangeOfIndexIntArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Declare arr array :");
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Please Provide which start index :");
        int start = in.nextInt();
        System.out.print("Please Provide which end index :");
        int end = in.nextInt();
        System.out.print("Please Provide which is your Target :");
        int target = in.nextInt();

        System.out.println(linearSearchInRange(arr, start, end, target));
        in.close();
    }
    static int linearSearchInRange(int[] arr, int start, int end, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}

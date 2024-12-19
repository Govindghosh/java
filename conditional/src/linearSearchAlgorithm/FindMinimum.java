package linearSearchAlgorithm;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please provide a int array :");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println();
        System.out.print("Please provide a start index :");
        int start = in.nextInt();
        System.out.println();
        System.out.print("Please provide a end index :");
        int end = in.nextInt();
        System.out.println(mini(arr, start, end));

    }
    static int mini(int[] arr, int start, int end){
        if (arr.length == 0){
            return 0;
        }
        int minValue = arr[0];
        for (int i = start; i < end; i++) {
            if (minValue > arr[i]){
                minValue = arr[i];
            }
        }

        return minValue;
    }
}

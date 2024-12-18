package array;

import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.print("Please fill the arr capacity is 4 :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Please which index find by value :");
        int target = in.nextInt();
        // call linear fn
        int ans = linearSearch(arr, target);
        System.out.println("You target index of :" + ans);
        int ans1 = linearSearch1(arr, target);
        System.out.println("You targeted element :" + ans1);
        boolean ans2 = linearSearch2(arr, target);
        System.out.println("Your target true or false :" + ans2);
    }
    // search the target and return index
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check element for every index if it is == Target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    // search the target and return element
    static int linearSearch1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
    // search the target and return true and False
    static boolean linearSearch2(int[] arr, int target){
        if (arr.length ==0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return true;
            }
        }
        return false;
    }

}

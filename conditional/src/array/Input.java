package array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // array of premitives
        int[] arr = new int[4];
        arr[0] = 23;
        arr[1] = 50;
        arr[2] = 100;
        arr[3] = 160;
        System.out.println(arr[2]);
        // arr[3] is very lengthy
        // input using for loop
        System.out.println("Enter 6 integers:");
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        // array of object
        System.out.println(" Print string");
        String[] strArr = new String[6];
        for (int i = 0; i < strArr.length; i++){
            strArr[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(strArr));
    }
}

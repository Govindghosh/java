package array;

import java.util.Arrays;
import java.util.Scanner;

public class PassingFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        System.out.print("Please fill the integer of array: ");
        for (int i = 0; i < num.length; i++){
            num[i] = in.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(num));
        // call the change fn
        System.out.println("Which index have to change");
        int index = in.nextInt();
        System.out.println("write a new value");
        int newValue = in.nextInt();
        change(num, index, newValue);
        System.out.println("Updated arrays :" + Arrays.toString(num));

    }

    static void change(int[] arr, int i, int newValue){
        if (i >= 0 && i <= arr.length) {
            arr[i] = newValue;
        } else {
            System.out.println("Index out of bounds!");
        }
    }

}

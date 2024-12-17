package array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[5];
        System.out.print("Please input the array to reverse: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        int start = 0;
        int end = list.length - 1;

        reverse(list, start, end); // Call reverse method
        System.out.print("Reversed array: ");
        // display array
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            System.out.print(value + " ");
        }
    }

    static void swap(int[] list, int start, int end) {
        int temp = list[start];
        list[start] = list[end];
        list[end] = temp;
    }

    static void reverse(int[] list, int start, int end) {
        while (start < end) {
            // Call swap function
            swap(list, start, end);
            start++;
            end--;
        }
    }
}

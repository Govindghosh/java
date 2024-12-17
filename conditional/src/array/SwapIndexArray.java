package array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndexArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[4];
        // input the list
        System.out.print("Please input you list index :");
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        // swap the value in index
        swap(list, 1, 2);
        System.out.println("swaped " + Arrays.toString(list));
    }
    static void swap(int[] list, int index1,int index2){
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
}

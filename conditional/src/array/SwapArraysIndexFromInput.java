package array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArraysIndexFromInput {
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
        //input the which index
        System.out.print("Please which index :");
        int which = in.nextInt();
        System.out.print("Please provide to which index :");
        int to = in.nextInt();
        // swap the value in index
        swap(list, which, to);
        System.out.println("swaped " + Arrays.toString(list));
    }
    static void swap(int[] list, int which,int to){
        int temp = list[which];
        list[which] = list[to];
        list[to] = temp;
    }
}



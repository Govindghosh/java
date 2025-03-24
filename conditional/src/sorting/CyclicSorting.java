package sorting;

import java.util.Arrays;

import static sorting.SelectionSorting.swap;

public class CyclicSorting {
    public static void main(String[] args) {
    int[] arr = {4,5,3,2,1};
    cyclicSort(arr);
        System.out.println("Cycle sorted "+ Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }
}

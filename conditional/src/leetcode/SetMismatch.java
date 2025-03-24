package leetcode;

import java.util.Arrays;

// Question https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println("my nums is"+ Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int i= 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int a, int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

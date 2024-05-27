
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.Arrays;

public class squares_of_sorted_array {
    public static int[] sortedSquares(int[] nums) {
        int max =0;
        for(int i = 0;i < nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }

        Arrays.sort(nums);
        return nums;


    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int [] sorted_nums = sortedSquares(nums);
        System.out.println(Arrays.toString(sorted_nums));

    }
}

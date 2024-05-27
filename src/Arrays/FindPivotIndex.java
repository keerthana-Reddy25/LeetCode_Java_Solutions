package Arrays;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int total_sum = Arrays.stream(nums).sum();
        int left_sum = 0;
        for(int i =0 ; i<nums.length;i++){
            int right_sum = total_sum - left_sum -nums[i];
            if(right_sum == left_sum){
                return i;
            }
            left_sum += nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println("pivot index is "+ pivotIndex(arr));;

    }
}

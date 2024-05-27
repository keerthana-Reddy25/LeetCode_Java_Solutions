package Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public static int dominantIndex(int[] nums) {

        //first find max num of array and store its index
        int max_num = 0;
        int max_num_index = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]>max_num){
                max_num = nums[i];
                max_num_index = i;
            }

        }
        System.out.println("max num"+max_num);

        //now check if the max num is atleast twice as every other number in the array

        for(int i : nums){
            if(i != max_num && max_num < i*2){
                return -1;
            }

        }
        return max_num_index;

    }
    public static void main(String[] args) {
        int [] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));

    }
}

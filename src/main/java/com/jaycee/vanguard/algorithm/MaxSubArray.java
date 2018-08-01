package com.jaycee.vanguard.algorithm;

/**
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 Example:
 Input: [-2,1,-3,4,-1,2,1,-5,4],
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = 0;
        for( int i = 0 ; i < nums.length ; i++){
            temp = nums[i];

            if( temp > max)
                max = temp;

            for(int j = i+1; j < nums.length; j++ ){
                temp = temp + nums[j];
                if( temp > max )
                    max = temp;
            }

        }

        return max;
    }

    public static void main(String []args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println( maxSubArray.maxSubArray(nums));
    }
}

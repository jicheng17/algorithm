package com.jaycee.vanguard.algorithm;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            int first = nums[i];
            int sec = target - first;

            for(int j= 0; j<nums.length;j++){
                if(nums[j] == sec && i != j){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static void main(String []args){
        TwoSum twoSum = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        System.out.println( twoSum.twoSum( nums, 18)[0]);
        System.out.println( twoSum.twoSum( nums, 18)[1]);
    }
}

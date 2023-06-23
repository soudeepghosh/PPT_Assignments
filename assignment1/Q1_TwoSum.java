package ppt.assignment1;
// Leetcode #1. Two Sum

import java.util.Arrays;
import java.util.HashMap;

public class Q1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r = target - nums[i];
            if(map.containsKey(r))
                return new int[] {map.get(r),i};
            else
                map.put(nums[i],i);    
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        // Test Case : Input: nums = [2,7,11,15], target = 9
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9))); //o/p: [0, 1]
    }
}

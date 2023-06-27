package ppt.assignment3;
// Leetcode #136. Single Number

import java.util.HashMap;
import java.util.Map;

public class Q6_SingleNumber {
    // Using Bit manupulation (XOR approach)
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    // Using HashMap (linear space complexity)
    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int singleNumUsingHashMap(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1)
                return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        // Example 1:
        // Input: nums = [2,2,1]
        // Output: 1
        System.out.println(singleNumber(new int[]{2,2,1}));
        // Example 2:
        // Input: nums = [4,1,2,1,2]
        // Output: 4
        System.out.println(singleNumUsingHashMap(new int[]{4,1,2,1,2}));
    }

}

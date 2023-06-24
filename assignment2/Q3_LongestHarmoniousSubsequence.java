package ppt.assignment2;
// Leetcode #594. Longest Harmonious Subsequence

import java.util.HashMap;
// Time complexity: O(n)
//Space complexity: O(n) 
public class Q3_LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            int len = 0;
            if(map.containsKey(nums[i]+1)){
                len = map.get(nums[i]) + map.get(nums[i]+1);
            }
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        // Test Case 1
        System.out.println(findLHS(new int[]{1,3,2,2,5,2,3,7})); //output: 5
        // Test Case 2
        System.out.println(findLHS(new int[]{1,2,3,4})); //output: 2
        //Test Case 3
        System.out.println(findLHS(new int[]{1,1,1,1})); // output: 0
    }
}
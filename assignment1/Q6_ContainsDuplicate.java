package ppt.assignment1;
// Leetcode #217. Contains Duplicate

import java.util.HashSet;

public class Q6_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        // Testcase : Input: nums = [1,2,3,1]
        // Output: true
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}

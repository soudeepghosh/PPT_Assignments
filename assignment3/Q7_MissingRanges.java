package ppt.assignment3;
//    Leetcode #163. Missing Ranges

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7_MissingRanges {
    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        int next = lower;
        for (int i = 0; i < nums.length; i++) {
            if(lower == Integer.MAX_VALUE) return res;
            if (nums[i] < next) {
                continue;
            }
            if (nums[i] == next) {
                next++;
                continue;
            }
            res.add(Arrays.asList(next, nums[i] - 1));
            if(nums[i] == Integer.MAX_VALUE) return res;
            next = nums[i] + 1;
        }
        
        if (next <= upper) {
            res.add(Arrays.asList(next, upper));
        }
        return res;
    }
    
    public static void main(String[] args) {
        // Example 1:
        // Input: nums = [0,1,3,50,75], lower = 0, upper = 99 
        // Output: [[2,2],[4,49],[51,74],[76,99]]
        System.out.println(findMissingRanges(new int[]{0,1,3,50,75}, 0, 99));
    }
}

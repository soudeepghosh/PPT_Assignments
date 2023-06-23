package ppt.assignment1;
// Leetcode #645. Set Mismatch

import java.util.Arrays;
import java.util.HashSet;

public class Q8_SetMismatch {
    static public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int n = nums.length;
        int sum = 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(set.contains(nums[i]))
                res[0] = nums[i];
            else
                set.add(nums[i]);    
        }
        res[1] = (n*(n+1)/2) - sum + res[0];

        return res;
    }
    static public void main(String[] args) {
        // Testcase : Input: nums = [1,2,2,4]
        // Output: [2,3]
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
    }
}

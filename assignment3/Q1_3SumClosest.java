package ppt.assignment3;
// Leetcode #16. 3Sum Closest

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if(n==3) return nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                list.add(sum);
                if(sum<target) low++;
                else high--;
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            minDiff = Math.min(minDiff,Math.abs(list.get(i)-target));
        }
        int ans = 0;
        for(int i=0;i<list.size();i++){
            if(Math.abs(list.get(i)-target)==minDiff)
            ans = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        // Example 1:
        // Input: nums = [-1,2,1,-4], target = 1
        // Output: 2
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
        // Example 2:
        // Input: nums = [0,0,0], target = 1
        // Output: 0
        System.out.println(threeSumClosest(new int[]{0,0,0}, 1));
    }
}

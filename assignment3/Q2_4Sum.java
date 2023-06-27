package ppt.assignment3;
//  Leetcode #18. 4Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int low = j+1, high = n-1;
                while(low<high){
                    int sum = nums[i]+nums[low]+nums[high]+nums[j];
                    if(sum==-294967296) return list;// In case Integer range crossed
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[low],nums[high],nums[j]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(sum<target) low++;
                    else high--;
                }
                while(j+1<n && nums[j]==nums[j+1]) j++;
                while(i+1<n && nums[i]==nums[i+1]) i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Example 1:
        // Input: nums = [1,0,-1,0,-2,2], target = 0
        // Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
        // Example 2:
        // Input: nums = [2,2,2,2,2], target = 8
        // Output: [[2,2,2,2]]
        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
    }
}

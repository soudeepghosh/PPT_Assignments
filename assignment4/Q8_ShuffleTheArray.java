package ppt.assignment4;
    // Leetcode #1470. Shuffle the Array

import java.util.Arrays;

public class Q8_ShuffleTheArray {
    static public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int t = n;
        int k = 0;
        for(int i=0;i<nums.length;i+=2){
            res[i] = nums[k++]; 
        }
        for(int i=1;i<nums.length;i+=2){
            res[i] = nums[t];
            t++; 
        }
        return res;
    }
    public static void main(String[] args) {
        // Input: nums = [2,5,1,3,4,7], n = 3
        // Output: [2,3,5,4,1,7] 
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
        // Input: nums = [1,2,3,4,4,3,2,1], n = 4
        // Output: [1,4,2,3,3,2,4,1]
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
    }
}

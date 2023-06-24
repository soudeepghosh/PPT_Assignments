package ppt.assignment2;
// Leetcode #561. Array Partition

import java.util.Arrays;
// Time complexity: O(n*logn)
//Space complexity: O(1) 
public class Q1_ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // Test Case 1
        System.out.println(arrayPairSum(new int[]{1,4,3,2})); //output: 4
        //Test Case 2
        System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));//output: 9
    }
}

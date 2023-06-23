package ppt.assignment1;
// Leetcode #283. Move Zeroes

import java.util.Arrays;

public class Q7_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int ele:nums){
            if(ele != 0){
                nums[i] = ele;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args) {
        //Testcase : Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

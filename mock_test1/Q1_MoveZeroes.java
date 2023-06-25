package ppt.mock_test1;

import java.util.Arrays;

public class Q1_MoveZeroes {
    //Time complexity : O(n)
    //Space complexity : O(1)
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++] = nums[i];
            }    
        }
        while(idx<nums.length){
            nums[idx++] = 0;
        }
    }
    public static void main(String[] args) {
        //Example 1:
        // Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]
        int[] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
        //Example 2:
        // Input: nums = [0]
        // Output: [0]
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}

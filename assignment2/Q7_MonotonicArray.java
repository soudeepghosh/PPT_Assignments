package ppt.assignment2;
// Leetcode #896. Monotonic Array

public class Q7_MonotonicArray {
    // Time complexity: Linear: O(n)
    // Space complexity: Constant: O(1)
    static public boolean isMonotonic(int[] nums) {
        boolean flag = false;
        if(nums[0]>nums[nums.length-1]) flag = true;
        for(int i=0;i<nums.length-1;i++){
            if(flag){
                if(nums[i]<nums[i+1]) return false;
            }
            else{
                if(nums[i]>nums[i+1]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Testcase 1:
        // Input: nums = [1,2,2,3]
        // Output: true
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        // Testcase 1:
        // Input: nums = [1,3,2]
        // Output: false
        System.out.println(isMonotonic(new int[]{1,3,2}));
    }
}

package ppt.assignment2;
// Leetcode #908. Smallest Range I

public class Q8_SmallestRangeI {
    static public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int diff = (max-k) - (min+k);
        if(diff<0) return 0;
        
        return diff;
    }
    public static void main(String[] args) {
        // Testcase 1:
        // Input: nums = [1], k = 0
        // Output: 0
        System.out.println(smallestRangeI(new int[]{1}, 0));
        // Testcase 2:
        // Input: nums = [0,10], k = 2
        // Output: 6
        System.out.println(smallestRangeI(new int[]{0,10}, 2));
        // Testcase 3:
        // Input: nums = [1,3,6], k = 3
        // Output: 0
        System.out.println(smallestRangeI(new int[]{1}, 0));
    }
}

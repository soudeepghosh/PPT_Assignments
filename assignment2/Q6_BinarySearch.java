package ppt.assignment2;
// Leetcode #704. Binary Search

public class Q6_BinarySearch {
    //Time complexity: O(logN)
    //Space complexity: O(1)
    static public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high--;
            else low++;
        }
        return -1;
    }
    public static void main(String[] args) {
        //Testcase 1: 
        // Input: nums = [-1,0,3,5,9,12], target = 9
        // Output: 4
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));

        //Testcase 2: 
        // Input: nums = [-1,0,3,5,9,12], target = 2
        // Output: -1
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }
}

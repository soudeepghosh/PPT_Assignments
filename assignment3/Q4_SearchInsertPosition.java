package ppt.assignment3;
//   Leetcode #35. Search Insert Position

public class Q4_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int mid = 0;
        if(nums[j]<target) return j+1;
        while(i<=j){
            mid = i+(j-i)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) j--;
            else i++;
        }
        return mid;
    }
    public static void main(String[] args) {
        // Example 1:
        // Input: nums = [1,3,5,6], target = 5
        // Output: 2
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        // Example 3:
        // Input: nums = [1,3,5,6], target = 7
        // Output: 4
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }    
}

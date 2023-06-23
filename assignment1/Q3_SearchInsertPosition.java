package ppt.assignment1;
// Leetcode #35. Search Insert Position

public class Q3_SearchInsertPosition {
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
        // testcase : nums = [1,3,5,6], target = 5
        System.out.println(searchInsert(new int[]{1,3,5,6},5)); // output: 2
    }
}

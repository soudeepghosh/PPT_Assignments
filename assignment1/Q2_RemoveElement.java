package ppt.assignment1;
// Leetcode #27. Remove Element

public class Q2_RemoveElement {
    static public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        // Testcase : Input: nums = [3,2,2,3], val = 3
        // Output: 2, nums = [2,2,_,_]
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }
}

package ppt.assignment5;

import java.util.Arrays;

public class Q3_SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] res = new int[nums.length];
        int i = nums.length-1;
        while(left<=right){
            int leftSq = nums[left]*nums[left];
            int rightSq = nums[right]*nums[right];
            if(leftSq>=rightSq){
                res[i] = leftSq;
                left++;
            }else{
                res[i] = rightSq;
                right--;
            }
            i--;
        }
        return res;
    }
    public static void main(String[] args) {
        // Input: nums = [-4,-1,0,3,10]
        // Output: [0,1,9,16,100]
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
        // Input: nums = [-7,-3,2,3,11]
        // Output: [4,9,9,49,121]
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}

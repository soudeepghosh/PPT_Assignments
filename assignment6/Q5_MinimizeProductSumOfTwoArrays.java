package ppt.assignment6;

import java.util.Arrays;

public class Q5_MinimizeProductSumOfTwoArrays {
    public static int minProductSum(int[] nums1, int[] nums2) {
        int ans = 0;
        // Sort nums1 and nums2 in ascending order.
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        
        int i = 0;
        int j = nums2.length-1;
        // Iterate over two sorted arrays and calculate the 
        // cumulative product sum.        
        while(i < nums1.length && j >= 0)
        {
            ans += nums1[i] * nums2[j];
            i++;
            j--;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        // Input: nums1 = [5,3,4,2], nums2 = [4,2,2,5]
        // Output: 40
        System.out.println(minProductSum(new int[]{5,3,4,2}, new int[]{4,2,2,5}));
    }
}

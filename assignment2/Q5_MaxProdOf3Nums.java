package ppt.assignment2;
// Leetcode #628. Maximum Product of Three Numbers

public class Q5_MaxProdOf3Nums {
    // Time complexity: O(n)
    // Space Complextity: O(1)
    static public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int ele:nums){
            if(ele>max1){
                max3 = max2;
                max2 = max1;
                max1 = ele;
            }
            else if(ele>max2){
                max3 = max2;
                max2 = ele;
            }
            else if(ele>max3)
                max3 = ele;

            if(ele<min1){
                min2 = min1;
                min1 = ele;
            }
            else if(ele<min2)
                min2 = ele;    
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
    public static void main(String[] args) {
        //Testcase 1: 
        // Input: nums = [1,2,3]
        // Output: 6
        System.out.println(maximumProduct(new int[]{1,2,3}));
        //Testcase 1: 
        // Input: nums = [-100,-98,-1,2,3,4]
        // Output: 39200
        System.out.println(maximumProduct(new int[]{-100,-98,-1,2,3,4}));
    }
}

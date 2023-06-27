package ppt.assignment3;
// Leetcode #66. Plus One

import java.util.Arrays;

public class Q5_PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length ;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res; 
    }
    public static void main(String[] args) {
        // testcase 1
        System.out.println(Arrays.toString(plusOne(new int[]{9})));// output: [1,0]
        // testcase 2
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1}))); //output: [4,3,2,2]
    }
}

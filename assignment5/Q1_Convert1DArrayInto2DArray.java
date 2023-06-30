package ppt.assignment5;
    // Leetcode 2022. Convert 1D Array Into 2D Array

import java.util.Arrays;

public class Q1_Convert1DArrayInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] mat = new int[m][n];
        if(m*n!=original.length) return new int[0][0];
        int k=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j] = original[k++];
            }
        }
        return mat;
    }
    public static void main(String[] sou) {
        // Input: original = [1,2,3,4], m = 2, n = 2
        // Output: [[1,2],[3,4]]
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1,2,3,4}, 2, 2)));
        // Input: original = [1,2,3], m = 1, n = 3
        // Output: [[1,2,3]]
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1,2,3}, 1, 3)));
    }
}

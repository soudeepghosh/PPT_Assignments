package ppt.assignment4;
   // Leetcode #867. Transpose Matrix

import java.util.Arrays;

public class Q3_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int j=0;j<matrix[0].length;j++)
            for(int i=0;i<matrix.length;i++)
                result[j][i] = matrix[i][j];
        return result;            
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{
                           { 2,  4, -1},
                           {-10, 5, 11},
                           {18,  -7, 6} })));
    }
}

package ppt.assignment6;

import java.util.Arrays;

public class Q7_SpiralMatrix_II {
    public static int[][] generateMatrix(int n) {
        int num[][] = new int[n][n];
        int count = 1;
        int top = 0,left = 0,bottom = n -1,right = n - 1;
        while(top <= bottom && left <= right){
            for(int i = left ; i <= right ; i++){
                num[top][i] = count++;
            }
            top++;
            for(int i = top ; i <= bottom; i++){
                num[i][right] = count++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i --){
                    num[bottom][i] = count++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i --){
                    num[i][left] = count++;
                }
                left++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        // Input: n = 3
        // Output: [[1,2,3],[8,9,4],[7,6,5]] 
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}

package ppt.assignment6;
// Leetcode #74. Search a 2D Matrix

public class Q2_Searcha2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==0) return false;
        int low=0,high = m*n-1;
        while(low<=high){
            int midIdx = low + (high-low)/2;
            int rowIdx = midIdx/n;
            int colIdx = midIdx%n;
            int midEle = matrix[rowIdx][colIdx];
            if(target==midEle) return true;
            else{
                if(target<midEle) high = midIdx-1;
                else low = midIdx+1;}
            }
        return false;
    }
    public static void main(String[] args) {
        // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
        // Output: true
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(mat, 3));
    }
}

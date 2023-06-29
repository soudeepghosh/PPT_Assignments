package ppt.assignment4;
    // Leetcode #598. Range Addition II

public class Q7_RangeAddition_II {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0)
            return m*n;
        int row=Integer.MAX_VALUE, col=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++) {
            row = Math.min(row,ops[i][0]);
            col = Math.min(col,ops[i][1]);
        }
        return row*col;
    }
    public static void main(String[] args) {
        // Input: m = 3, n = 3, ops = [[2,2],[3,3]]
        // Output: 4
        System.out.println(maxCount(3, 3, new int[][]{new int[]{2,2},new int[]{3,3}}));
        // Input: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
        // Output: 4
        System.out.println(maxCount(3, 3, new int[][]{new int[]{2,2},new int[]{3,3},new int[]{3,3},new int[]{3,3},new int[]{2,2},new int[]{3,3},new int[]{3,3},new int[]{3,3},new int[]{2,2},new int[]{3,3},new int[]{3,3},new int[]{3,3}}));
    }
}

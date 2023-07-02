package ppt.assignment5;
// Leetcode #153. Find Minimum in Rotated Sorted Array

public class Q7_FindMinimumInRotatedSortedArray {
    public static int findMin(int[] A) {
        final int N = A.length;
        if(N == 1) return A[0];
        int start = 0, end = N-1, mid;
        while(start < end){
            mid = (start+end) / 2;
            if(mid > 0 && A[mid] < A[mid-1]) return A[mid];
            if(A[start] <= A[mid] && A[mid] > A[end]) start = mid + 1;
            else end = mid - 1;
        }
        return A[start];
    }
    public static void main(String[] args) {
        // Input: nums = [3,4,5,1,2]
        // Output: 1
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}

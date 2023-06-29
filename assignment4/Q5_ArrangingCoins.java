package ppt.assignment4;
  // Leetcode #441. Arranging Coins
public class Q5_ArrangingCoins {
    public static int arrangeCoins(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start<=end){
            long mid = start+(end-start)/2;
            long x = mid*(mid+1)/2;
            if(n>=x){
                ans = (int)mid;
                start = (int)mid+1;
            }    
            else end = (int)mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // Input: n = 5
        // Output: 2
        System.out.println(arrangeCoins(5));

        // Input: n = 8
        // Output: 3
        System.out.println(arrangeCoins(8));
    }
}

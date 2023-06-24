package ppt.assignment2;
// Leetcode #605. Can Place Flowers

public class Q4_CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n==0) return true;
        for(int i=0;i<len;i++){
            if(flowerbed[i]==0 &&(i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0)){
                flowerbed[i] = 1;
                n--;
            }
            if(n==0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //Test Case 1: flowerbed = [1,0,0,0,1], n = 1
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1)); //output: true
        // Test Case 2: flowerbed = [1,0,0,0,1], n = 2
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2)); //output: false
    }
}

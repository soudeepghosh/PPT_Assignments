package ppt.assignment2;
// Leetcode #575. Distribute Candies

import java.util.HashSet;
// Time complexity: O(n)
//Space complexity: O(n) 
public class Q2_DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        return Math.min(candyType.length/2,set.size());
    }
    public static void main(String[] args) {
        //Test Case 1
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));// output: 3
        //Test case 2
        System.out.println(distributeCandies(new int[]{1,1,2,3})); //output: 2
        //Test case 3
        System.out.println(distributeCandies(new int[]{6,6,6,6})); //output: 1
    }
}

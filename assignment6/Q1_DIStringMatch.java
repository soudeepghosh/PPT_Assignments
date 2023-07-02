package ppt.assignment6;
// Leetcode #942. DI String Match

import java.util.Arrays;

public class Q1_DIStringMatch {
    public static int[] diStringMatch(String s) {
        int[] arr = new int[s.length()+1];
        
        int n = s.length();
        int l = 0;
        int r = n; 
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                arr[i] = l++;
            }   
            else{
               arr[i] = r--; 
            }   
        }
        arr[n] = l;
        return arr;
    }
    public static void main(String[] args) {
        // Input: s = "IDID"
        // Output: [0,4,1,3,2]
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }
}

package ppt.assignment5;
// Leetcode #1385. Find the Distance Value Between Two Arrays

import java.util.Arrays;

public class Q5_FindDistanceValueBetweenTwoArrays {
     static private int Binary_Search(int[] arr,int key,int d)
    {
        int l=0;
        int r=arr.length-1;
        int mid;
        while(l<=r)
        {
            mid=(l+r)/2;
            int val=Math.abs(arr[mid]-key);
            if(val<=d)return mid;
            else if(arr[mid]>key)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            if(Binary_Search(arr2,arr1[i],d)==-1)
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        // Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
        // Output: 2
        System.out.println(findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }
}

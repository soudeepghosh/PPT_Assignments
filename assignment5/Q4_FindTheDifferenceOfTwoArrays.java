package ppt.assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q4_FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(!list1.contains(nums2[i]))
                if(!set1.contains(nums2[i])) 
                    list1.add(nums2[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!list2.contains(nums1[i]))
                if(!set2.contains(nums1[i])) 
                    list2.add(nums1[i]);
        }
        return Arrays.asList(list2,list1);
    }
    public static void main(String[] args) {
        // Input: nums1 = [1,2,3], nums2 = [2,4,6]
        // Output: [[1,3],[4,6]]
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
        // Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
        // Output: [[3],[]]
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }
}

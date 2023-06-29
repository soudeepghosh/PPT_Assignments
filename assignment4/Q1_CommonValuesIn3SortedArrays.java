package ppt.assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q1_CommonValuesIn3SortedArrays {
    static List<Integer> commonValues(int[] arr1,int[] arr2, int[] arr3){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            set2.add(arr2[i]);
        }
        TreeSet<Integer> res = new TreeSet<>();
        for(int i=0;i<arr3.length;i++){
            if(set1.contains(arr3[i]) && set2.contains(arr3[i])){
                res.add(arr3[i]);
            }
        }
        for(Integer ele:res) list.add(ele);
        return list;
    }
    public static void main(String[] args) {
        // Example 1:
        // Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8] 
        // Output: [1,5]
        System.out.println(commonValues(new int[]{1,2,3,4,5}, new int[]{1,2,5,7,9}, new int[]{1,3,4,5,8}));
    }
}

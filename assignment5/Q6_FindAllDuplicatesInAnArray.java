package ppt.assignment5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q6_FindAllDuplicatesInAnArray {
    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                list.add(nums[i]);
            else
                set.add(nums[i]);    
        }
        return list;
    }
    public static void main(String[] args) {
        // Input: nums = [4,3,2,7,8,2,3,1]
        // Output: [2,3]
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        // Input: nums = [1,1,2]
        // Output: [1]
        System.out.println(findDuplicates(new int[]{1,1,2}));
    }
}

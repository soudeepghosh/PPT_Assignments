package ppt.assignment5;
// Leetcode #2007. Find Original Array From Doubled Array

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q8_FindOriginalArrayFromDoubledArray {
    public static int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0)
            return new int[]{};
        Arrays.sort(changed);
        Queue<Integer> queue = new LinkedList<>();
        int[] res = new int[changed.length/2];
        int i = 0;
        for(int ele : changed){
            if(!queue.isEmpty() && queue.peek() == ele){
                res[i++] = queue.poll()/2;
            }else{
                queue.add(ele*2);
            }
        }
        return (queue.size() == 0)?res: new int[]{};
    }    
    public static void main(String[] args) {
        // Input: changed = [1,3,4,2,6,8]
        // Output: [1,3,4]
        System.out.println(Arrays.toString(findOriginalArray(new int[]{1,3,4,2,6,8})));
    }
}


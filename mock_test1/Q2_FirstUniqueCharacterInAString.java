package ppt.mock_test1;

import java.util.HashMap;

public class Q2_FirstUniqueCharacterInAString {
    //Time complexity : O(n)
    //Space complexity : O(n)
    static public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        // Example 1:
        // Input: s = "leetcode"
        // Output: 0
        System.out.println(firstUniqChar("leetcode"));
        // Example 2:
        // Input: s = "loveleetcode"
        // Output: 2
        System.out.println(firstUniqChar("loveleetcode"));
        // Example 3:
        // Input: s = "aabb"
        // Output: -1
        System.out.println(firstUniqChar("aabb"));
    }
}

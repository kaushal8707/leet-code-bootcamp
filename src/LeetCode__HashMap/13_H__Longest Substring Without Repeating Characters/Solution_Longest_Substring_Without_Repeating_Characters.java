import java.util.*;
import java.util.HashMap;


public class Solution_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcbdacbbasxz";
        String s1 = "abba";
        int lengthOfLongestSubString = lengthOfLongestSubString(s);
        System.out.println(lengthOfLongestSubString);
    }

    private static int lengthOfLongestSubString(String s){
        int left=0, right=0, res=0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(;right<arr.length; right++){

            Integer idx = map.getOrDefault(arr[right], -1);
            if(idx != -1 && idx >= left){
                res = Math.max(res, right - 1 - left + 1);
                left = idx + 1;
            }
            map.put(arr[right], right);
        }
        return Math.max(res, right - 1 - left + 1);
    }
}

import java.util.*;
import java.util.HashMap;

public class Solution_Sort_Characters_By_Frequency {
    public static void main(String[] args) {
       String s = "tree";
        String frequencySort = frequencySort(s);
        System.out.println(frequencySort);
    }

    private static String frequencySort(String s){
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() + 1];
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);   /** filling map with character as key and number of counts as a value */
        }
        map.keySet().forEach(
                c -> {
                    if(arr[map.get(c)] == null){
                        arr[map.get(c)] = new ArrayList();     /** with the help of this expression we are adding character in our list as per frequency index while we initialize array default value in array will be null bcz array using list  */
                    }
                    arr[map.get(c)].add(c);
                }
        );
        for(int i = arr.length-1; i > 0; i--){       // putted i>0 bcz at least number will occur 1 time in an array
            if(arr[i] != null){
                for(Character ch : arr[i]){
                    for(int j = 0; j < i; j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}
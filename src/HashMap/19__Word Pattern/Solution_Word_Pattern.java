import java.util.HashMap;
import java.util.Map;

public class Solution_Word_Pattern {
    public static void main(String[] args) {
        String pattern = "abba";  //abba or aaaa
        String s = "dog cat cat dog";  //dog cat cat fish  <- false
        boolean isomorphic = wordPattern(pattern, s);
        System.out.println(isomorphic);
    }

    private static boolean wordPattern(String pattern, String s){
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = arr[i];
            if((map.containsKey(c) && !map.get(c).equals(word)) ||
                    (!map.containsKey(c) && map.values().contains(word))) {
                return false;
            }
            map.put(c, word);
        }
        return true;
    }
}
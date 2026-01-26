import java.util.HashMap;
import java.util.Map;

public class Solution_Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "egg";  //abcd
        String t = "add";  //abab
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println(isomorphic);
    }

    private static boolean isIsomorphic(String s, String t){
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if((map.containsKey(ss) && map.get(ss)!= tt) ||
                    (!map.containsKey(ss) && map.values().contains(tt))) {
                return false;
            }
            map.put(ss, tt);
        }
        return true;
    }
}
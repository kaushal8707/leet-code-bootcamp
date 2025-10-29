import java.util.HashSet;
import java.util.Set;

public class Solution_First_Letter_to_Appear_Twice_Solution {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char repeatedCharacters = repeatedCharacters(s);
        System.out.println(repeatedCharacters);
    }

    private static char repeatedCharacters(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i)))
                return s.charAt(i);
            else
                set.add(s.charAt(i));
        }
        return 'a';
    }
}

import java.util.HashSet;
import java.util.Set;

public class Custom_Sort_String_Solution {
    public static void main(String[] args) {
        String order="cba"; //"cbafg";
        String s="aaabcd";    //"abcd";
        String customSortString = customSortString(order, s);
        System.out.println(customSortString);
    }

    private static String customSortString(String order, String s) {

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[] ca = new int[26];

        for(char i : order.toCharArray()){
            set.add(i);
        }
        for(char i : s.toCharArray()){
            if(!set.contains(i)){
                sb.append(i);
            }else{
                ca[i-'a']++;
            }
        }
        for(char c : order.toCharArray()){
            int i = ca[c-'a'];
            while(i>0){
                sb.append(c);
                i--;
            }
        }
        return sb.toString();
    }
}

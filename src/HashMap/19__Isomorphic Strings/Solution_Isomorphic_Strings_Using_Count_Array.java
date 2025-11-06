import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_Isomorphic_Strings_Using_Count_Array {
    public static void main(String[] args) {
        String s = "abcd";  //egg
        String t = "abab";  //add
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println(isomorphic);
    }

    private static boolean isIsomorphic(String s, String t){
        int st[] = new int[256];
        int ts[] = new int[256];
        Arrays.fill(st, -1);
        Arrays.fill(ts, -1);
        for(int i=0; i<s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(st[ss] == -1 && ts[tt] == -1){
                st[ss] = tt;     //storing tt asci value in array st
                ts[tt] = ss;      //storing tt asci value in array st
            }else if(st[ss] != tt || ts[tt] != ss){
                return false;
            }
        }
        return true;
    }
}
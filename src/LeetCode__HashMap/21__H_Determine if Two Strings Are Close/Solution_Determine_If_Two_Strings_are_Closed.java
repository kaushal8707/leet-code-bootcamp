import java.util.Arrays;

public class Solution_Determine_If_Two_Strings_are_Closed {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        boolean closeStrings = closeStrings(word1, word2);
        System.out.println(closeStrings);
    }
    private static boolean closeStrings(String word1, String word2){
        if(word1.length() != word2.length()){            //If both word length different return false
            return false;
        }
        int ca1[]=new int[26];                  //we want to find all character frequency because in question mentioned all small 26 characters
        int ca2[]=new int[26];                  //we will take count array
        for (char c : word1.toCharArray()) {
            ca1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            ca2[c - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(ca1[i]>0 && !(ca2[i]>0) || ca2[i]>0 && !(ca1[i]>0)){       // frequency count should be same in both characters array
                return false;                  // if character mismatch then return false
            }
        }
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        return Arrays.equals(ca1, ca2);       //If frequency table match then return true else return false
    }
}

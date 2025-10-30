import java.util.HashSet;
import java.util.Set;

public class Solution_2_Check_If_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
      String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence1 = "leetcode";
        boolean checkIfPangram = checkIfPangram(sentence);
        System.out.println(checkIfPangram);

    }

    private static boolean checkIfPangram(String sentence){
        boolean arr[] = new boolean[26];
        for(int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i) - 'a'] = true;
        }
        for(boolean curr : arr){
            if(!curr){
                return false;
            }
        }
        return true;
    }
}

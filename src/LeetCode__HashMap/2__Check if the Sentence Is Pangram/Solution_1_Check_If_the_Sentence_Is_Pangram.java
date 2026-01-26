import java.util.HashSet;
import java.util.Set;

public class Solution_1_Check_If_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
      String sentence = "thequickbrownfoxjumpsoverthelazydog";
      String sentence1 = "leetcode";
        boolean checkIfPangram = checkIfPangram(sentence);
        System.out.println("Is Pangram : "+checkIfPangram);

    }

    private static boolean checkIfPangram(String sentence){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}

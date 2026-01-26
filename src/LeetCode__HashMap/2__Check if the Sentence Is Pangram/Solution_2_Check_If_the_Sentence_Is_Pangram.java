import java.util.HashSet;
import java.util.Set;

public class Solution_2_Check_If_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
      String sentence = "thequickbrownfoxjumpsoverthelazydo";
        String sentence1 = "leetcode";
        boolean checkIfPangram = checkIfPangram(sentence);
        System.out.println(checkIfPangram);

    }

    private static boolean checkIfPangram(String sentence){
        Set<Character> set = new HashSet<>();
       for(char c : sentence.toCharArray()) {
           if(!set.contains(c)){
               set.add(c);
           }
       }
       if(set.size() != 26){
           return false;
       }
        return true;
    }
}

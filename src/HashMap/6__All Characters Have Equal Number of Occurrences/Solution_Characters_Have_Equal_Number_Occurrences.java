public class Solution_Characters_Have_Equal_Number_Occurrences {
    public static void main(String[] args) {
        String s = "abacbc";  // abacbca
        boolean areOccurrencesEqual = areOccurrencesEqual(s);
        System.out.println(areOccurrencesEqual);
    }

    private static boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        int x = 0;
        for(int i : count){
            if(i != 0 && x==0){
                x = i;     //starting first value storing into x to compare equality from next character
            } else if(i != 0){
                if(x != i){  //start comparing from second character if count not equal to zero and not equal to the store value in x
                    return false;
                }
            }
        }
        return true;
    }
}

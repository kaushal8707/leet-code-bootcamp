public class Solution_Maximum_Number_Vowels_Substring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k=3;
        maxVowels(s, k);
    }

    private static int maxVowels(String s, int k) {
        int l=0;
        int r=0;
        int window=0;
        int res=0;
        for(; r<k; r++){
            window += isVowel(s.charAt(r));
        }
        res=window;
        // abc  window = 1

        while(r < s.length()){
            window -= isVowel(s.charAt(l++));
            window += isVowel(s.charAt(r++));
            res = Math.max(res, window);
        }
        return res;
    }

    private static int isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
}

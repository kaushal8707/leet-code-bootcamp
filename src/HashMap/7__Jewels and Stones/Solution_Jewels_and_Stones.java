import java.util.HashSet;
import java.util.Set;

public class Solution_Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int numJewelsInStones = numJewelsInStones(jewels, stones);
        System.out.println(numJewelsInStones);
    }

    private static int numJewelsInStones(String jewels, String stones){
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(char i : jewels.toCharArray()){
            set.add(i);
        }
        for(char i : stones.toCharArray()){
            if(set.contains(i)){
                res++;
            }
        }
        return res;
    }
}

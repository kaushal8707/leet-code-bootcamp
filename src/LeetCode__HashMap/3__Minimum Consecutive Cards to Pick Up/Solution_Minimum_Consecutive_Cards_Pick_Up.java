import java.util.HashMap;
import java.util.Map;

public class Solution_Minimum_Consecutive_Cards_Pick_Up {
    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        int[] cards1 = {1,0,5,3};

        int minimumCardPickUp = minimumCardPickUp(cards);
        System.out.println(minimumCardPickUp);
    }

    private static int minimumCardPickUp(int[] cards){
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                res = Math.min(res, i - map.get(cards[i])  + 1);  // 1 to 50 how many = (50 - 1 + 1) = 50
            }
            map.put(cards[i], i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

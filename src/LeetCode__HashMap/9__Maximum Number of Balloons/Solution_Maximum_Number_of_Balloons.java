import java.util.HashMap;
import java.util.Map;

public class Solution_Maximum_Number_of_Balloons {
    public static void main(String[] args) {
        String text = "nlaebolko";
        String text1 = "loonbalxballpoon";
        int maxNumberOfBalloons = maxNumberOfBalloons(text1);
        System.out.println(maxNumberOfBalloons);


    }

    private static int maxNumberOfBalloons(String text){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n'){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

      int x =  Math.min(map.getOrDefault('b', 0), Math.min(map.getOrDefault('a', 0), map.getOrDefault('n', 0)));
      int xx = Math.min(map.getOrDefault('l', 0), map.getOrDefault('o', 0));

      return Math.min(x, xx/2);
    }
}
// b, a, n ->  1 times
// l, o -> 2 times
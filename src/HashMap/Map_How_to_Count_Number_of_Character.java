import java.util.HashMap;
import java.util.Map;

public class Map_How_to_Count_Number_of_Character {
    public static void main(String[] args) {
        String str="kaushal singh";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(c != ' '){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(map);
    }
}

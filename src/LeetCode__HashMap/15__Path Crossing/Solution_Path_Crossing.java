import java.util.HashSet;
import java.util.Set;

public class Solution_Path_Crossing {
    public static void main(String[] args) {
        String path = "NESWW";
        String path1 = "NES";
        boolean pathCrossing = isPathCrossing(path1);
        System.out.println(pathCrossing);
    }

    private static boolean isPathCrossing(String path){
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(0+","+0);
        for(char c : path.toCharArray()){
            if(c == 'E'){
                x++;
            }else if(c == 'N'){
                y++;
            }else if(c == 'W'){
                x--;
            }else if(c == 'S'){
                y--;
            }
            String co_ordinate = x+","+y;
            if(set.contains(co_ordinate)){
                return true;
            }
            set.add(co_ordinate);
        }
        return false;
    }
}

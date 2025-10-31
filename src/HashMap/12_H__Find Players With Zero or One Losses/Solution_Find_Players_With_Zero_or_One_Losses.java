import java.util.*;

public class Solution_Find_Players_With_Zero_or_One_Losses {
    public static void main(String[] args) {
        int[][] matches = {{1,3}, {2,3}, {3,6}, {5,6}, {5,7}, {4,5}, {4,8}, {4,9}, {10,4}, {10,9}};
        List<List<Integer>> winners = findWinners(matches);
        System.out.println(winners);
    }

    private static List<List<Integer>> findWinners(int[][] matches){
        List<Integer> zeroLoses = new ArrayList<>();
        List<Integer> oneLoses = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();  // key as a team or player or value as a no. of loses
        for(int[] team : matches){
            map.put(team[0], map.getOrDefault(team[0],0) + 0);  // team who win the match or not loose the match so +0
            map.put(team[1], map.getOrDefault(team[1],0) + 1);  // team who loose the match so +1
        }
        for(int i : map.keySet()){
            if(map.get(i) == 0){
                zeroLoses.add(i);
            }else if(map.get(i) == 1) {
                oneLoses.add(i);
            }
        }
        Collections.sort(zeroLoses);
        Collections.sort(oneLoses);
        return Arrays.asList(zeroLoses, oneLoses);
    }
}

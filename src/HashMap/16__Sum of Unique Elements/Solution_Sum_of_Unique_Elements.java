import java.util.HashMap;
import java.util.Map;

public class Solution_Sum_of_Unique_Elements {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2}; //{1,1,1,1}
        int sumOfUnique = sumOfUnique(nums);
        System.out.println(sumOfUnique);
    }

    private static int sumOfUnique(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                res += i;
            }
        }
        return res;
    }
}

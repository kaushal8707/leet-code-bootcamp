import java.util.HashMap;
import java.util.Map;

public class Solution_2_Sum_of_Unique_Elements {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2}; //{1,1,1,1}
        int sumOfUnique = sumOfUnique(nums);
        System.out.println(sumOfUnique);
    }

    private static int sumOfUnique(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : nums){
            int f = map.getOrDefault(i, -1);
            if(f == -1){
                res += i;
                map.put(i, 1);
            }else if(f != -1 && f!= 0){
                res -= i;
                map.put(i, 0);
            }
        }
        return res;
    }
}

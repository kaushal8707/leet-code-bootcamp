import java.util.HashMap;
import java.util.Map;

public class Solution_Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;   //o-p : [1,1,2,1]  & [1,2,1,1]
        int numberOfSubArrays = numberOfSubArrays(nums, k);
        System.out.println(numberOfSubArrays);
    }

    private static int numberOfSubArrays(int[] nums, int k){
        int curr = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i : nums){
           curr += i % 2;
           res += map.getOrDefault(curr - k, 0);
           map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return res;
    }
}

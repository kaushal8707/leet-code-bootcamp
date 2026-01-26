import java.util.HashMap;
import java.util.Map;

public class Solution_Binary_SubArrays_With_Sum {
    public static void main(String[] args) {
       int[] nums = {1,0,1,0,1};
       int goal = 2;
       int numSubArraysWithSum = numSubArraysWithSum(nums, goal);
       System.out.println(numSubArraysWithSum);
    }

    private static int numSubArraysWithSum(int[] num, int goal){
        int res = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < num.length; i ++){
            prefixSum += num[i];
            res += map.getOrDefault(prefixSum - goal, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return res;
    }
}

//  1 0 1 0 1   goal 2
//  0 1 1 2 2 3   <- prefix sum
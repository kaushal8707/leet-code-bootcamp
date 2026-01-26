import java.util.HashMap;
import java.util.Map;

public class Solution_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1,0,1,2,1,0,4,1,3};//{1,1,1}; //{1,2,3} , k = 3  &  1 3 6      ----- 1 1 2 4 5 5 9 10 13
        int k = 4; //2; //3;
        int subArraySum = subArraySum(nums, k);
        System.out.println(subArraySum);
    }

    private static int subArraySum(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // bcz in prefix sum it is not counting first index
        int curr = 0;
        int res = 0;
        for(int i : nums){
            curr += i;    // find prefix sum  -> {1,1,1} -> prefix sum: {1,2,3} and suppose k = 2
            res += map.getOrDefault(curr - k, 0);   // find count of prefix_sum - k (given)
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return res;
    }
}

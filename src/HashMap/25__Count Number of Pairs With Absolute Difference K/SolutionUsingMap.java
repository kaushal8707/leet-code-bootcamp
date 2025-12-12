import java.util.HashMap;
import java.util.Map;

public class SolutionUsingMap {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int countKDifference = findCountKDifference(nums, k);
        System.out.println(countKDifference);
    }

    public static int findCountKDifference(int[] nums, int k){
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            res += map.getOrDefault(nums[i] + k, 0); // using getOrDefault we can avoid if check either element is exist in map
            res += map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], map.getOrDefault(nums[i] ,0) + 1);
        }
        return res;
    }
}

// TC and SC - O(n)
// SC -O(1) limited no of elements
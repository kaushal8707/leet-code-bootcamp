import java.util.HashMap;
import java.util.Map;

public class MajorityElements_HashMap_Implementation {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};  // 3,2,3
        int majorityElements = majorityElements(nums);
        System.out.println(majorityElements);
    }

    private static int majorityElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > n){
                return i;
            }
        }
        return -1;
    }
}

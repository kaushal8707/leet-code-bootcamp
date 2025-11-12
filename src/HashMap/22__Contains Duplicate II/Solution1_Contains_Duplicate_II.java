import java.util.HashMap;
import java.util.Map;

public class Solution1_Contains_Duplicate_II {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int nums1[] = {1,2,3,1,2,3};
        int k = 3;  int k1=2;
        boolean containsNearByDuplicates = containsNearByDuplicates(nums, k);
        System.out.println(containsNearByDuplicates);
    }

    private static boolean containsNearByDuplicates(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int i : nums){
            if(map.containsKey(i) && Math.abs(idx - map.get(i)) <= k){
                return true;
            }else{
                map.put(i, idx);
            }
            idx++;
        }
        return false;
    }
}

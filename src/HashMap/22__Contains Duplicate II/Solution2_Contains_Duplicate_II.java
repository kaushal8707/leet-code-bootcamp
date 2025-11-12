import java.util.HashSet;
import java.util.Set;

public class Solution2_Contains_Duplicate_II {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,1,2,3};
        int arr[] = {1,2,3,1};
        int k = 3;  int k1=2;
        boolean containsNearByDuplicates = containsNearByDuplicates(arr1, k1);
        System.out.println(containsNearByDuplicates);
    }

    private static boolean containsNearByDuplicates(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}

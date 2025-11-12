import java.util.HashSet;
import java.util.Set;

public class Solution_Maximum_Erasure_Value {
    public static void main(String[] args) {
        int nums[] = {4,2,4,5,6};                      //op- 2 4 5 6 so total 17
        int maximumUniqueSubarray = maximumUniqueSubarray(nums);
        System.out.println(maximumUniqueSubarray);

    }
    private static int maximumUniqueSubarray(int[] nums){
        int left=0;
        int sum=0;
        int res=0;
        Set<Integer> set = new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            res = Math.max(res, sum);
        }
        return res;
    }
}

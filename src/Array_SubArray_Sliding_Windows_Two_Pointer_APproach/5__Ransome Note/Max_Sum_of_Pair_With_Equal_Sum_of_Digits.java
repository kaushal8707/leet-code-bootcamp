import java.util.HashMap;
import java.util.Map;

public class Max_Sum_of_Pair_With_Equal_Sum_of_Digits {
    public static void main(String[] args) {
        int[] nums = {18, 43, 36, 13, 7,54};
        int maximumSum = maximumSum(nums);
        System.out.println(maximumSum);
    }

    private static int maximumSum(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int i = 0; i < nums.length; i ++){
            int s = sum(nums[i]);
            if(map.containsKey(s)){
                res = Math.max(res, nums[i] + map.get(s));
                if(nums[i] > map.get(s)){
                    map.put(s, nums[i]);
                }
            }else{
                map.put(s, nums[i]);
            }
        }
        return res;
    }

    private static int sum(int n){
        int sum=0;
        while (n>0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}

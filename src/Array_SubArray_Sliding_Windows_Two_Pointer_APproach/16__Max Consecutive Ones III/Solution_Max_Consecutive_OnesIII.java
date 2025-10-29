public class Solution_Max_Consecutive_OnesIII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int longestOnes = longestOnes(nums, k);
        System.out.println(longestOnes);
    }

    private static int longestOnes(int[] nums, int k){

        int left=0;
        int ans=0;
        int window=0;
        for(int right=0; right<nums.length; right++){
            window = window + nums[right];

            while(window+k < (right-left+1)){
                window = window - nums[left];
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}

public class Solution_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int[] nums1 = {1,1,0,1,1,1,0,0,0,1,1,1,1,1};

        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int window=0;
        int ans=-1;
        for(int right=0;right<nums.length;right++){
            window=window+nums[right];   // while condition met we will add in window
            while (right-left+1 != window){
                window = window - nums[left];   // till condition not satisfy we will remove from window
                left++;
            }
            ans = Math.max(ans, (right-left+1));
        }
        return ans;
    }
}

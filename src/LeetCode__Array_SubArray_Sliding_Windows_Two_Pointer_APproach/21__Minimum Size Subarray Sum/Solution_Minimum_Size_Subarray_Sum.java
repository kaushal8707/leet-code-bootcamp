public class Solution_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int target=7;
        int[] nums={2,3,1,2,4,3};
        int minSubArrayLen = minSubArrayLen(target, nums);
        System.out.println(minSubArrayLen);
    }

    private static int minSubArrayLen(int target, int[] nums){
        int n=nums.length;
        int window=0;
        int ans= n+1;//Integer.max(0, n+1);  // length of subarray should always be lesser than length of given array
        int left=0;
        for(int right=0; right<n; right++){
            window += nums[right];
            while (window >= target){
                ans = Math.min(ans, right - left + 1);
                window -= nums[left++];
            }
        }
        return ans;
    }
}

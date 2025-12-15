public class Solution_Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int nums [] ={1, 12, -5, -6, 50, 3};
        int k = 4;
        double maxAverage = findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }

    private static double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ans=0;
        double window=0;
        for(int i=0; i<k; i++){
            window += nums[i];
        }
        ans = window/k;

        for(int right=k; right<n; right++){
            window = window + nums[right] - nums[right-k];
            ans = Math.max(ans, window / k);
        }
        return ans;
    }
}

public class Finding_the_Longest_Streak_of_Ones_with_One_Flip {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0};
        int[] nums1 = {1,0,1,1,0,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int ans=0;
        int window=0;
        for(int right=0; right<nums.length;right++){
            window += nums[right];

            while(!(window==right-left+1 || window==right-left)){
                window -= nums[left];
                left++;
            }

            ans = Math.max(ans, (right-left+1));
        }
        return ans;
    }
}

public class SelfTry {
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1,0,0,0,1,1,1,1,1};
        maxConsecutiveOnes(nums1);
    }

    private static void maxConsecutiveOnes(int[] nums1) {
        int left=0;
        int window=0;
        int ans=0;
        for(int right=0;right<nums1.length;right++){
            window += nums1[right];

            while(right-left+1 != window){
                window -= nums1[left];
                left++;
            }

            ans = Math.max(ans, right-left+1);
        }
        System.out.println(ans);
    }
}

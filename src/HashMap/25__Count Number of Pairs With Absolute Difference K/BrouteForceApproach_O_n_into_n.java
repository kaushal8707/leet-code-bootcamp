public class BrouteForceApproach_O_n_into_n {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int countKDifference = countKDifference(nums, k);
        System.out.println(countKDifference);
    }

    public static int countKDifference(int[] nums, int k){
        int res = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    res++;
                }
            }
        }
        return res;
    }
}

// Approach - Not Recommended
// TC - O(n * n)
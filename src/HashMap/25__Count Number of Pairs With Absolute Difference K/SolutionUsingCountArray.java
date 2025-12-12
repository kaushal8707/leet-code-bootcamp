public class SolutionUsingCountArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int countKDifference = checkCountKDifference(nums, k);
        System.out.println(countKDifference);
    }

    public static int checkCountKDifference(int[] nums, int k) {
        int res=0;
        int ca[]=new int[101];

        for(int i:nums){
            ca[i]++;
        }

        for(int i=0; i<101 - k; i++){
            res += ca[i] * ca[i + k];
        }
        return res;
    }
}

// TC - O(n)
// SC - constant bcz of 101 array size - O(1)
public class BrooteForceApproach {

    public static int validSubArrays(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i] <= nums[j]){
                    res++;
                }else {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,4,1,5};
        int validSubArrays = validSubArrays(nums);
        System.out.println(validSubArrays);
    }
}

//Time Complexity - O(n * n)
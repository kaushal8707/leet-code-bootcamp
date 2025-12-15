import java.util.Arrays;

public class KRadiusSubarrayAveragesSolution {
    public static void main(String[] args) {
        int nums[]={7,4,3,9,1,8,5,2,6};
        int k=3;
        int[] averages = getAverages(nums, k);
        System.out.println(Arrays.toString(averages));
    }

    public static int[] getAverages(int nums[], int k){
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        long win = 0;
        int kk = k;
        int idx = 2*k+1;
        if(idx > n){
            return res;
        }

        for(int i=0; i<idx; i++){
            win += nums[i];                              //first sliding window
        }
        res[kk] = (int) (win / idx);

        for(int i=idx; i<n; i++){
            win = win - nums[i - idx] + nums[i];         //for rest sliding windows add right and remove left element
            res[++k] = (int) (win / idx);                //increase radius while moving sliding windows by 1
        }

        return res;
    }
}

import java.util.Arrays;

public class TwoSum_AdditionalSolution {
    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 7, 10, 11, 15, 16}, 17);
    }

    private static void twoSum(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] > target){
                j--;   //if sum is greater than target remove maximum right element because array is sorted
            }else if(arr[i]+arr[j] < target){
                i++;   //if sum is lesser than target remove lower element because array is sorted
            }else {
                System.out.println(Arrays.toString(new int[]{arr[i], arr[j]}));
                i++;
            }
        }
    }
}


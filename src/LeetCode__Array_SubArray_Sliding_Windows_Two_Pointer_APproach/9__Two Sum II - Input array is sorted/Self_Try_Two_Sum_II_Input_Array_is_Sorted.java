import java.util.Arrays;

public class Self_Try_Two_Sum_II_Input_Array_is_Sorted {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] twoSum(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] > target){
                j--;   //if sum is greater than target remove maximum right element because array is sorted
            }else if(arr[i]+arr[j] < target){
                i++;   //if sum is lesser than target remove lower element because array is sorted
            }else
                return new int[]{arr[i], arr[j]};
        }
        return null;
    }
}

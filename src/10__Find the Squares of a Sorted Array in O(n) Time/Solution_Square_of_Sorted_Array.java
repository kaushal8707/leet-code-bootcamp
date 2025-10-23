import java.util.Arrays;

/**
 * input - [-4, -1, 0, 3, 10]
 * output - [0, 1, 9, 16, 100]
 */

public class Solution_Square_of_Sorted_Array {
    public static void main(String[] args) {
       int[] arr = {-4, -1, 0, 3, 10};
        int[] squareOfSortedArray = squareOfSortedArray(arr);
        System.out.println(Arrays.toString(squareOfSortedArray));
    }

    private static int[] squareOfSortedArray(int[] arr) {
      int l = 0;
      int r = arr.length-1;
      int[] res = new int[arr.length];
      for(int i=arr.length-1; i>=0; i--){
          if(Math.abs(arr[l]) > Math.abs(arr[r])){
              res[i] = (arr[l] * arr[l]);
              l++;
          }else{
              res[i] = (arr[r] * arr[r]);
              r--;
          }
      }
      return res;
    }
}

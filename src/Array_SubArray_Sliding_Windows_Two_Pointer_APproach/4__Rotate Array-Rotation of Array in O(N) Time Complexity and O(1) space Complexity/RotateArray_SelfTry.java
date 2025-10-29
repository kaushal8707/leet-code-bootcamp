import java.util.Arrays;

/**
 *
 * i/p - 2,3,4,5,6
 * o/p - 4,5,6,2,3
 *
 *
 * Hint
 * total array element N = 5
 * rotation point = 2
 * rotation point always should be d <= N
 * reverse both parts from rotation point
 * and again print in a reverse order
 */

public class RotateArray_SelfTry {
    public static void main(String[] args) {
        int rPoint=2;
        int[] arr = {2, 3, 4, 5, 6};
        rotatedArray(arr, rPoint);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotatedArray(int[] arr, int d){
        //before rotation point reverse
        reverse(arr, 0, d-1);
        //after rotation point reverse
        reverse(arr, d, arr.length-1);
        //reverse the resultant array
        reverse(arr, 0, arr.length-1);
    }

    //take 2 pointer start and end, swap it and left increase and right decrease
    public static void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

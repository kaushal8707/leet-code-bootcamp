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
public class RotateArray_ProblemSolution {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        leftRotate(arr, 5, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotate(int[] arr, int n, int d) {
        rev(arr, 0, d-1);
        rev(arr, d, n-1);
        rev(arr, 0, n-1);
    }

    private static void rev(int[] arr, int i, int j) {
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
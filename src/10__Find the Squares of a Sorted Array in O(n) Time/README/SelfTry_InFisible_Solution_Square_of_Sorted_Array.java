package README;

import java.util.Arrays;

/**
 * input - [-4, -1, 0, 3, 10]
 * output - [0, 1, 9, 16, 100]
 */

public class SelfTry_InFisible_Solution_Square_of_Sorted_Array {
    public static void main(String[] args) {
       int[] arr = {-4, -1, 0, 3, 10};
       squareOfSortedArray(arr);
    }

    private static void squareOfSortedArray(int[] arr) {
        int[] squaredArrayElements = Arrays.stream(arr)
                .map(i -> i * i)
                .toArray();
        Arrays.sort(squaredArrayElements);
        System.out.println(Arrays.toString(squaredArrayElements));
    }
}

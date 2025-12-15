/**
 *
 * linear search
 * 
 */

public class Problem2 {
    public static void main(String[] args) {
        int element=1;
        int searchResult = linearSearch(new int[]{2, 3, 1, 9, 6, 7}, element);
        if(searchResult == -1) {
            System.out.println(element+" not found");
        }else{
            System.out.println(element+" found at index "+searchResult);
        }
    }

    private static int linearSearch(int[] arr, int element) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

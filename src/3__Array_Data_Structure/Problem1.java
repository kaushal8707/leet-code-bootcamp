/**
 *
 * binary search
 *
 */

public class Problem1 {
    public static void main(String[] args) {
        int element=17;
        int searchResult = binarySearch(new int[]{2, 3, 4, 7, 55, 99}, element);
        if(searchResult == -1) {
            System.out.println(element+" not found");
        }else{
            System.out.println(element+" found at index "+searchResult);
        }
    }

    private static int binarySearch(int[] arr, int element) {
        int l=0;
        int r=arr.length-1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(arr[mid]==element) {
                return mid;
            }else if(arr[mid]>element) {
                r = mid-1;
            }
            else if(arr[mid]<element) {
                l = mid+1;
            }
        }
        return -1;
    }
}

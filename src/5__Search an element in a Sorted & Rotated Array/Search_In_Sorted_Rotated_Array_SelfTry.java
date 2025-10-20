public class Search_In_Sorted_Rotated_Array_SelfTry {
    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int l=0;
        int r=arr.length-1;   //8
        int key = 10;
        int bSearchInSortedRotatedArray = search(arr, l, r, key);
        System.out.println(bSearchInSortedRotatedArray);
    }

    private static int search(int[] arr, int l, int r, int key) {
        int pivot = getPivot(arr, l, r);
        int e = binarySearch(arr, l, pivot, key);
        if(e == -1){
            e = binarySearch(arr, pivot+1, r, key);
        }
        return e;
    }

    private static int getPivot(int[] arr, int l, int r) {
        while(l<=r){
            int mid=(l+r) / 2;
            if(arr[mid] > arr[mid+1]) {
                return mid;
            }else if(arr[mid] < arr[mid-1]) {
                return mid - 1;
            }else if(arr[mid] > arr[l]) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int l, int r, int key) {
        while (l<=r){
            int mid=(l+r)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}

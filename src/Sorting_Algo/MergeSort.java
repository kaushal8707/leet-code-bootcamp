
public class MergeSort {
    public static void main(String[] args) {

        int arr[]={5, 1, 2, 8, 9, 3, 4, 6};
        int l=0;
        int r=arr.length-1;

        System.out.println("\n-----Before Sorting-----\n");
        for(int n:arr){
            System.out.print(n+" ");
        }

        mergeSort(arr, l, r);

        System.out.println("\n-----After sorting----\n");
        for(int i:arr){
            System.out.print(i+" ");
        }


    }

    private static void mergeSort(int[] arr, int l, int r) {

        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            mergeSortedArray(arr, l, mid,r);
        }
    }

    private static void mergeSortedArray(int[] arr, int l, int mid, int r) {

        int lArrSize=mid-l+1;
        int rArrSize=r-mid;

        //declare 2 empty left and right array
        int lArray[]=new int[lArrSize];
        int rArray[]=new int[rArrSize];

        //copy the value into left and right array from an actual array
        for(int i=0; i<lArrSize ;i++){
            lArray[i]=arr[i+l];
        }
        for(int j=0; j<rArrSize; j++){
            rArray[j]=arr[mid+1+j];
        }

        //comparing 2 arrays and storing into a sorted array
        int i=0;
        int j=0;
        int k=l;
        while(i<lArrSize && j<rArrSize){
            if(lArray[i]<=rArray[j]){
                arr[k]=lArray[i];
                i++;
            }else {
                arr[k]=rArray[j];
                j++;
            }
            k++;
        }

        while(i<lArrSize) {
                arr[k]=lArray[i];
                i++;
                k++;
            }
        while(j<rArrSize) {
            arr[k]=rArray[j];
            j++;
            k++;
        }


    }
}

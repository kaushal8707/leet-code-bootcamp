package arrays.codes;

public class MergeTwoArray
{
    public static void main(String[] args) {

        int arr1[]={2,4,6};
        int arr2[]={1,3,5,7,11};
        int arr[]=new int[arr1.length+arr2.length];
        mergeTwoSortedArray(arr,arr1,arr2);
        for(int m : arr)
        {
            System.out.print(m+" ");
        }

    }

    private static void mergeTwoSortedArray(int arr[], int[] arr1, int[] arr2)
    {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }else  if(arr2[j]<arr1[i])
            {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }

    }

}

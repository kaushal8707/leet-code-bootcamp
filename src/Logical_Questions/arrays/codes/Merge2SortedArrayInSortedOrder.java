package arrays.codes;

public class Merge2SortedArrayInSortedOrder
{
    public static void main(String[] args) {

        int arr1[]={1,3,5,7,9,16};
        int arr2[]={2,4,8,11,13,14};
        int arr[]=new int[arr1.length+arr2.length];
        int k=0,i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }else
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
        for(int m:arr)
        {
            System.out.print(m+" ");
        }
    }
}

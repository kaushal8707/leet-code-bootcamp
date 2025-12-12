package arrays.codes;
public class FindPairsOfSum
{
    public static void main(String[] args) {
        int sum=8;
        int arr[]={5,4,3,2,1,6,7,8,9};
        //first sort array's elements
        doSort(arr);
       //find pair's
        int l=0;
        int r=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            while(l<r)
            {
                if(arr[l]+arr[r]>sum)
                {
                    r--;
                }else if(arr[l]+arr[r]<sum)
                {
                    l++;
                }else if(arr[l]+arr[r]==sum)
                {
                    System.out.println("("+arr[l]+","+arr[r]+")");
                    l++;
                }
            }
        }


    }

    private static void doSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

package arrays.codes;

public class FindPairsWithGivenSumInArray
{
    public static void main(String[] args) {

        int arr[]={5,8,3,4,2,6,10,7,1,9};
        int sum=11;
        int l=0,r=arr.length-1;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]>arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for(int k:arr)
            {
                System.out.print(k+" ");
            }

        getPairs(arr,l,r,sum);
    }

    private static void getPairs(int[] arr, int l, int r,int sum)
    {
        while(l<r)
        {
            if(arr[l]+arr[r]>sum)
            {
                r--;
            }else if(arr[l]+arr[r]<sum)
            {
                l++;
            }else
            {
                System.out.println("("+arr[l]+","+arr[r]+")");
                l++;
            }
        }
    }


}

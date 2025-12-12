package arrays.codes;
public class FindUniqueFromArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,1,2,4,5};
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
           for(int j=i+1;j<arr.length-1;j++)
           {
                if(arr[i]!=arr[j])
                {
                    arr[count]=arr[i];
                    count++;
                }
           }
        }
        for(int k=0;k<=count;k++)
        {
            System.out.print(arr[k]);
        }
    }
}

package arrays.codes;

public class FindThreeMaxFromArray
{
    public static void main(String[] args) {
        int arr[]={8,1,6,2,3,5,4,11,19};
        int max1=0,max2=0,max3=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=max1;
                max2=arr[i];
            }else if(arr[i]>max3)
            {
                max3=arr[i];
            }
        }
        System.out.print(max1+"  "+max2+"  "+max3);
    }
}

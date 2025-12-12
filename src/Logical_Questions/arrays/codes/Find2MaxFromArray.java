package arrays.codes;

public class Find2MaxFromArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9,8,7,6,5};
        int max1=0,max2=0,max3=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2)
            {
                max2=max1;
                max2=arr[i];
            }else if(arr[i]>max3)
            {
                max3=arr[i];
            }
        }
        System.out.println("Max1 = "+max1+"   Max2 ="+max2+" Max3= "+max3);
    }
}

package arrays.codes;
public class GreatestTwoNumbersAmongArray
{
    public static void main(String[] args) {

        int arr[]={8,10,5,2,3,7,4,6,9,11};
        int max1=arr[0],max2=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.print(max1+"                 " +max2);
    }
}

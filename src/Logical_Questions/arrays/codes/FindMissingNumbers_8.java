package arrays.codes;
import java.util.Arrays;
import java.util.function.Consumer;

public class FindMissingNumbers_8
{
    public static void main(String[] args) {
        System.out.println("Missing Numbers: ");
        int arr[]={1,2,3,6,7,9,10};
        int array[]= {1,2,3,4,6,7,8,9,10};
        int j=0;
        for(int i=1;i<=10;i++)
        {
            if(j<arr.length && i==arr[j])
            {
                j++;
            }else
            {
                System.out.print(i+"  ");
            }
        }

        System.out.println();
        System.out.println("Another ways *************");
        printMissingNumbers(array);

    }

    public static void printMissingNumbers (int arr[])
    {
        int length=arr.length;
        int n=10;
        int sumOf_N_Numbers=n*(n+1)/2;
        int sum=0;
        int sumOfArrayElements= Arrays.stream(arr).sum();
        int missingNum=sumOf_N_Numbers-sumOfArrayElements;
        System.out.println("Missing Number : "+ missingNum);
    }
}

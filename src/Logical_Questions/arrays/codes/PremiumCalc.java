package arrays.codes;
import java.util.*;
import java.util.stream.Collectors;


public class PremiumCalc
{
    public static void main(String[] args) {
     Set<Integer> set=new HashSet<Integer>();
     int arr[]={1,2,3,2,3,5,4,5,6,5,6,4,7,8,77};
     for(int i=0;i<arr.length;i++)
     {
         int count=0;

         for(int j=0;j<arr.length;j++)
         {
             if(arr[i]==arr[j])
             {
                 count++;
             }
         }
         if(count==1)
         {
             set.add(arr[i]);
         }
     }
    }
}

package arrays.codes;

public class FindUniqueIntoAnArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,6,5,4,7,5,6,8,9};
        for(int i=0;i<arr.length;i++) {
            int count=0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[j]!=0)
                {
                    count++;
                    arr[j]=0;
                }
            }
            if(count==0 && arr[i]!=0)
            {
                System.out.print(arr[i]);
            }

        }
    }
}

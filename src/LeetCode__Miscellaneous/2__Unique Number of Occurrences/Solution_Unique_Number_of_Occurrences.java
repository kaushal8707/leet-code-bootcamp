import java.util.Arrays;

public class Solution_Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3};// {1,2}-> false,    {-3,0,1,-3,1,1,1,-3,10,0}-> true
        int arr1[] = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean uniqueOccurrences = uniqueOccurrences(arr1);
        System.out.println(uniqueOccurrences);

    }

    private static boolean uniqueOccurrences(int[] arr) {
        int ca[] = new int[2001];
        for(int i : arr){
            ca[i + 1000]++;
        }
        Arrays.sort(ca);
        for(int i=0; i<2000; i++){
            if(ca[i] != 0 && ca[i] == ca[i+1])
                return false;
        }
        return true;
    }
}

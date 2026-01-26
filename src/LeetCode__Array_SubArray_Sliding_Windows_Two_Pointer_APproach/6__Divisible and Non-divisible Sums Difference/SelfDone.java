public class SelfDone {
    public static void main( String[] args )
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int divNum=3;
        int sumDifferenceOfDivAndNonDiv = sumDifferenceOfDivAndNonDiv(arr, divNum);
        System.out.println(sumDifferenceOfDivAndNonDiv);
    }

    private static int sumDifferenceOfDivAndNonDiv(int[] arr, int divNum) {
        int n = arr.length;
        int x =  n/divNum;
        int sumOfDivNum = divNum * x*(x+1)/2;
        int sumNonDIvNum = n * (n+1)/2 - sumOfDivNum;
        return sumNonDIvNum-sumOfDivNum;
    }
}

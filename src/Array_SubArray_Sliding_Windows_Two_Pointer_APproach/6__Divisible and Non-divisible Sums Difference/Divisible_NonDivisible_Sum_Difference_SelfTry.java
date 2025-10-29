public class Divisible_NonDivisible_Sum_Difference_SelfTry {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = 10; // n is the total no. start from 1
        int m = 3; // divisible by 3
        int divNonDivSumDiff = divNonDivSumDiff(arr, m, n);
        System.out.println(divNonDivSumDiff);
    }

    private static int divNonDivSumDiff(int[] arr, int m, int n) {

        int x = n/m;   //suppose 1.2.3.4....10 and divisible by 3 which is m, suppose we have total number div by m or 3 is x
        int num2 = m*x*(x+1)/2;    // so, x = 3,6,9,...., 3(1+2+...x), ....3 * x(x+1)/2, .... so sum of divisible no. = m * x * (x + 1)/2
        int num1 = n*(n+1)/2 - num2;  // so, non div number = total no of 10 sum - divisible sum = n*(n+1)/2 - num2
        return num1-num2;  // this give results
    }
}

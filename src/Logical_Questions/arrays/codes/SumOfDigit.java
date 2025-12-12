package arrays.codes;

public class SumOfDigit
{
    public static void main(String[] args) {
        int number=567896;
        int rem=0,sum=0;
        while(number!=0)
        {
            rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        System.out.println("Sum of Digit="+sum);
    }
}

package arrays.codes;

public class CheckArmStrongNumber
{
    public static void main(String[] args) {

        int number=153;
        int temp=number;
        int rem=0,sum=0;
        while(number!=0)
        {
            rem=number%10;
            sum=sum+(rem * rem * rem);
            number=number/10;
        }
        if(temp==sum)
        {
            System.out.println("armstrong number");
        }
    }
}

package arrays.codes;
public class FindFactorials
{
    public static void main(String[] args)
    {
       int number=5;
       int result=findFactorial(number);
       System.out.println("factorial : "+result);

    }
    public static int findFactorial(int number)
    {
        int fact=1;
        while(number!=0)
        {
            fact=fact*number;
            number--;
        }
        return fact;
    }
}

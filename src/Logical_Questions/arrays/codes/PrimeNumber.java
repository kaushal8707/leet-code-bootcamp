package arrays.codes;
public class PrimeNumber
{
    public static void main(String[] args) {

        int number=9;
        boolean flag=false;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println(number);
        }
    }
}

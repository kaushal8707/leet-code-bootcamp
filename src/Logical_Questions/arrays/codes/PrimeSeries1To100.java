package arrays.codes;
public class PrimeSeries1To100
{
    public static void main(String[] args) {

        int limit=100;
        for (int i=1;i<=limit;i++)
        {
            boolean flag=false;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=true;
                }
            }
            if(!flag)
            {
                System.out.print(i+"  ");
            }
        }
    }
}

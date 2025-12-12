package strings.codes;
public class ReverseWordOnSamePlaceOfString
{
    public static void main(String[] args)
    {
        String name="kaushal is working in sapient";
        name=name+" ";
        char chArray[]=name.toCharArray();
        int start=0;
        for(int i=0;i<chArray.length;i++)
        {
            if(chArray[i]==' ')
            {
               for(int j=i-1;j>=start;j--)
               {
                   System.out.print(chArray[j]+"");
               }
                System.out.print(" ");
               start=i+1;
            }
        }

    }
}

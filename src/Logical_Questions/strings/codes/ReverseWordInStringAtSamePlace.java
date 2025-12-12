package strings.codes;
public class ReverseWordInStringAtSamePlace
{
    public static void main(String[] args)
    {
        String str="kaushal is currently working";
        str=str+" ";
        int start=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                for(int j=i;j>=start;j--)
                {
                    System.out.print(str.charAt(j));
                }
                start=i+1;
            }
        }

    }
}

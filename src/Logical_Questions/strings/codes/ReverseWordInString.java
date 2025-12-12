package strings.codes;

public class ReverseWordInString
{
    public static void main(String[] args) {

        String str="kaushal is currently working";
        int start=str.length();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                System.out.print(str.substring(i,start));
                start=i;
            }
            if(i==0)
            {
                System.out.print(str.substring(i,start));
            }
        }

    }
}

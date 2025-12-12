package strings.codes;

public class WordLengthCount
{
    public static void main(String[] args) {

        String str="kaushal starts working with publicis sapient ";
        int start=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.println(str.substring(start,i)+"     "+(i-start));
                start=i+1;
            }
        }
    }
}

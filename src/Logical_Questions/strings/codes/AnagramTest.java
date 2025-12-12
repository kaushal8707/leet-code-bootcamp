package strings.codes;

public class AnagramTest
{
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        s1=getSort(s1);
        s2=getSort(s2);
        if(s1.length()==s2.length() && s1.equals(s2))
        {
            System.out.println("Anagram");
        }else
        {
            System.out.println("Not An Anagram");
        }
    }

    private static String getSort(String s)
    {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
           for(int j=i+1;j<ch.length;j++)
           {
               if(ch[j]<ch[i])
               {
                   char temp=ch[j];
                   ch[j]=ch[i];
                   ch[i]=temp;
               }
           }
        }
        return new String(ch);
    }
}

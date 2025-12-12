package strings.codes;

public class PalindromeCheck
{
    public static void main(String[] args) {

        String str="madam";
        char ch[]=str.toCharArray();
        String temp=str;
        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
        {
           char c=ch[i];
           ch[i]=ch[j];
           ch[j]=c;
        }
        if(temp.equals(new String(ch)))
        {
            System.out.println(temp+" is Palindrome");
        }else
        {
            System.out.println(temp+" Not a Palindrome");
        }
    }
}

package strings.codes;

public class CheckPalindrome
{
    public static void main(String[] args) {

        String str="madama";
        char chArr[]=str.toCharArray();
        String temp=str;
        for(int i=0,j=chArr.length-1;i<chArr.length/2;i++,j--)
        {
            char ch=chArr[i];
            chArr[i]=chArr[j];
            chArr[j]=ch;
        }
        if(temp.equals(new String(chArr)))
        {
            System.out.println("P");
        }else
        {
            System.out.println("NP");
        }
    }
}

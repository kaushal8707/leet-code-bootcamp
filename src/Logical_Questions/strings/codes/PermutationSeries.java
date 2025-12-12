package strings.codes;
public class PermutationSeries
{
    public static void main(String[] args) {

        String str="abc";
        String temp="";
        getPermutation(str,temp);

    }

    private static void getPermutation(String str, String result)
    {
        if(str.length()==0)
        {
            System.out.println(result);
        }
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            getPermutation(res,ch+result);
        }
    }
}
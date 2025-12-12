package strings.codes;

public class ReverseAString
{
    public static void main(String[] args) {

        String str="kaushal is currently working";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}

package strings.codes;

public class Print_banana_b_ba_ban_bana_banan_banana_a_an_ana
{
    public static void main(String[] args) {

        String str="banana";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                System.out.print(str.substring(i,j+1)+",");
            }
        }
    }
}

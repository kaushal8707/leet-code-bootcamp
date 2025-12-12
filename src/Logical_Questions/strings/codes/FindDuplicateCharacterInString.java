package strings.codes;
class FindDuplicateCharacterInString
{
    public static void main(String[] args) {
        String str="kaushal kumar singh";
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    ch[j]='0';
                }
            }
            if(count>0 && ch[i]!='0')
            {
                System.out.print(ch[i]);
            }
        }
    }
}

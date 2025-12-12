package strings.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateCharacter_Find_Unique_Character
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        char chArray[]=input.toCharArray();
        Set<Character> set=new TreeSet<Character>();
        for(int i=0;i<chArray.length;i++)
        {
            boolean check=false;
            for(int j=i+1;j<chArray.length;j++)
            {
                if(chArray[i]==chArray[j])
                {
                    check=true;
                    break;
                }
            }
            if(check)
            {
                input=input.replaceAll(String.valueOf(chArray[i]),"");
            }
        }
        System.out.println(input);
    }
}

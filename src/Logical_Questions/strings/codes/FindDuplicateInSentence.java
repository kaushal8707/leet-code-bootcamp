package strings.codes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateInSentence
{
    public static void main(String[] args) {

        String sentence="i am go when i am go to school";
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        String str[]=sentence.split(" ");
        for(int i=0;i<str.length;i++)
        {
            int count=0;
            for(int j=0;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    count++;
                }
            }
            if(count>=1)
            {
                map.put(str[i],count);
            }
        }
        for(Map.Entry s:map.entrySet())
        {
            System.out.println(s);
        }
    }
}

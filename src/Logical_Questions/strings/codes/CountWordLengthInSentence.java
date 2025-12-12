package strings.codes;
import javax.swing.text.html.parser.Entity;
import java.util.*;

public class CountWordLengthInSentence
{
    public static void main(String[] args)
    {
        String sentence="kaushal starts working with publicis sapient";
        sentence=sentence+" ";
        Map<String,Integer> map=new HashMap<String,Integer>();
        int start=0;
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)==' ') {
                String str = sentence.substring(start, i);
                map.put(str,(i-start));
                start=i+1;
            }
        }
        List<Map.Entry<String,Integer>> list=new ArrayList(map.entrySet());
        Collections.sort(list,new LengthComparator());
        for(Map.Entry e : list)
        {
            System.out.println(e);
        }
    }
}

class LengthComparator implements Comparator<Map.Entry<String,Integer>>
{
    @Override
    public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2)
    {
        return e1.getValue().compareTo(e2.getValue());
    }
}

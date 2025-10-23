import java.util.LinkedHashMap;
import java.util.Map;

public class SelfTry_Length_Of_All_Words_In_Given_String {
    public static void main(String[] args) {
        String str="  fly me   to  the   moon  ";
        String str1 = " luffy   is still joyboy";
        str=str.concat(" ");
        char[] array = str.toCharArray();
        int j=0;
        int counter=0;
        Map<String, Integer> words_length = new LinkedHashMap<>();
        for(int i=0; i<array.length; i++){
            if(array[i]!=' '){
                counter++;
            }else if(counter>0){
                words_length.put(str.substring(j,i), counter);
                j=i;
                counter=0;
            }
        }
        System.out.println(words_length);
    }
}

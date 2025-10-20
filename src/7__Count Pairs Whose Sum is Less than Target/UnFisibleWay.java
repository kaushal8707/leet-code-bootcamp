import java.util.Arrays;
import java.util.List;

/**
 *
 * Time Complexity - O(n2)
 *
 */
public class UnFisibleWay {
    public static void main(String[] args) {

        int countedPairs = countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2);
        int countedPairs2 = countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2);

        System.out.println(countedPairs2);
    }

    public static int countPairs(List<Integer> ans, int target){
        int count=0;

        for(int i=0;i<ans.size();i++){
            for(int j=i+1;j<ans.size();j++){
                if(ans.get(i)+ans.get(j)<target){
                    System.out.println((ans.get(i)+","+ans.get(j)));
                    count++;
                }
            }
        }
        return count;
    }
}



import java.util.Arrays;
import java.util.List;

public class Find_Pairs_Whose_Sum_is_Less_than_Target {
    public static void main(String[] args) {
     //     int countedPairs = countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2);
        int countedPairs3 = countPairs(Arrays.asList(5,1,3,2,6,4), 5);
     //   int countedPairs2 = countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2);
        System.out.println(countedPairs3);

    }
    //-7 -6 -2 -1 2 3 5
    //-1 1 1 2 3
    //1 2 3 4 5 6
    public static int countPairs(List<Integer> ans, int target){
       int count=0;
       ans.sort((n1,n2)->n1-n2);
       int i=0;
       int j=ans.size()-1;
       while(i<j){
           if(ans.get(i)+ans.get(j)<target){
               count = count+ (j-i);
               int k=j;
               while(i<k){
                   System.out.println("["+ans.get(i)+","+ans.get(k)+"]");
                   k--;
               }
               i++;
           }else{
               j--;
           }
       }
        return count;
    }
}

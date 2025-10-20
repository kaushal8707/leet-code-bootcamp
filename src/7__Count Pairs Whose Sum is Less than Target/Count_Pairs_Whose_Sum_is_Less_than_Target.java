import java.util.Arrays;
import java.util.List;

public class Count_Pairs_Whose_Sum_is_Less_than_Target {
    public static void main(String[] args) {
        int countedPairs = countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2);
        int countedPairs3 = countPairs(Arrays.asList(5,1,3,2,6,4), 5);
      //  int countedPairs2 = countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2);
        System.out.println(countedPairs3);

    }
    //-7 -6 -2 -1 2 3 5
    //-1 1 1 2 3
    //1 2 3 4 5 6
    public static int countPairs(List<Integer> ans, int target){
        int count=0;
        ans.sort((a,b)->(a-b));
        int l=0;
        int r=ans.size()-1;
        //first we need to do the sort in case array Arrays.sort(arr[])
        while(l<r){
            if(ans.get(l)+ans.get(r)<target){
                count=count+(r-l);
                l++;
            }else{
                r--;
            }
        }
        return count;
    }
}

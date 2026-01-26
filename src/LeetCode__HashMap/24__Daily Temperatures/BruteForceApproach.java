import java.util.Arrays;

public class BruteForceApproach {
    public static void main(String[] args) {
        int tem[] = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] dailyTemperatures = dailyTemperatures(tem);
        System.out.println(Arrays.toString(dailyTemperatures));
    }

    public static int[] dailyTemperatures(int[] t){
        int res[] = new int[t.length];
        for(int i=0;i<t.length; i++){
            int curr = t[i];
            for(int j=i+1; j<t.length; j++){
                if(t[j] > curr){
                   res[i] = j - i;
                   break;
                }
            }
        }
        return res;
    }
}

// Exception - Time Limit Exceed
// TC - O(n*n)

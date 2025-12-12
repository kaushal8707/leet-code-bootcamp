public class Solution3_Optimise {
    public static boolean validateStackSequences(int[] pushed, int[] popped){
        int n = pushed.length;
        int j = 0;
        int k = -1;
        for(int i=0; i<n; i++){
            pushed[++k] = pushed[i];
            while (k > -1 && pushed[k] == popped[j]){
                k--;
                j++;
            }
        }
        return k == -1;
    }
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};  //{1,2,3,4,5}
        int[] popped = {4,5,3,2,1};  //{4,3,5,1,2}
        boolean validateStackSequence = validateStackSequences(pushed, popped);
        System.out.println(validateStackSequence);
    }
}
//TC - O(n)
//SC - O(1)
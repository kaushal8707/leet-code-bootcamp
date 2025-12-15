import java.util.Stack;

public class Solution2 {
    public static boolean doValidateStackSequence(int[] pushed, int[] popped){
        int n = pushed.length;
        int j = 0;
        int k = -1;
        int stack[] = new int[n]; // we took an additional array with name stack
        for(int i=0; i<n; i++){
            stack[++k] = pushed[i];
            while (k > -1 && stack[k] == popped[j]){
                k--;
                j++;
            }
        }
        return k == -1;
    }
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};  //{1,2,3,4,5}
        int[] popped = {4,5,3,2,1};  //{4,3,5,1,2}
        boolean validateStackSequence = doValidateStackSequence(pushed, popped);
        System.out.println(validateStackSequence);
    }
}

//TC - O(n)
//SC - O(n)
import java.util.Stack;

public class Solution {

    public static boolean validateStackSequence(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack();
        int j=0;

        for(int i=0; i<pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};  //{1,2,3,4,5}
        int[] popped = {4,5,3,2,1};  //{4,3,5,1,2}
        boolean validateStackSequence = validateStackSequence(pushed, popped);
        System.out.println(validateStackSequence);
    }
}

// TC and SC - O(n)
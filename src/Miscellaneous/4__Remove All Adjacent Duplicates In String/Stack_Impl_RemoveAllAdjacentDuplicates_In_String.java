import java.util.Stack;

public class Stack_Impl_RemoveAllAdjacentDuplicates_In_String {
    public static void main(String[] args) {
        String input ="abbaca";  //azxxzy
        String removeDuplicates = removeDuplicates(input);
        System.out.println(removeDuplicates);
    }

    private static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(!stack.empty() &&
                   stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.toString();
    }
}

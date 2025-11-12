import java.util.Stack;

public class Solution_Valid_Parentheses {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {
        String s = "[]{}()";
        String s1 = "[{()}}";
        boolean valid = isValid(s1);
        System.out.println(valid);
    }
    private static boolean isValid(String s){
        for(char i : s.toCharArray()){
            if(isBracketOpen(i)){
               stack.push(i);
            }else{
                if(stack.size()==0){          //if stack is empty
                    return false;
                }else{
                    if(areBracketMatching(stack.peek(), i)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;            //if after push and pop if our stack become empty means valid parentheses return true
    }

    private static boolean isBracketOpen(char c){
        switch (c){
            case '(':
            case '{':
            case '[':
                return true;
            default:
                return false;
        }
    }

    private static boolean areBracketMatching(char c, char d){
        if(c=='(' && d==')')
            return true;
        else if (c=='{' && d=='}')
            return true;
        else if(c=='[' && d==']')
            return true;
        else
            return false;
    }
}

import java.util.Stack;

public class Solution_BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab##";  //ab#c
        String t = "c#d#";  //ad#c
        boolean backspaceCompare = backspaceCompare(s, t);
        System.out.println(backspaceCompare);
    }

    public static boolean backspaceCompare(String s, String t){
        Stack<Character> ss = new Stack<>();
        Stack<Character> tt = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '#'){
                if(!ss.isEmpty()){
                    ss.pop();
                }
            }else{
                ss.push(i);
            }
        }
        for(char i : t.toCharArray()){
            if(i == '#'){
                if(!tt.isEmpty()){
                    tt.pop();
                }
            }else{
                tt.push(i);
            }
        }
        return ss.equals(tt);
    }
}

// TC - O(n)
// SC - O(n) + O(n) because of using 2 stacks


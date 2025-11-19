import java.util.Stack;

public class Solution_Simplify_Path {
    public static void main(String[] args) {
        String path1 = "/home//foo/";
        String path2 = "/../";
        String path3 = "/home/";
        String simplifyPath = simplifyPath(path1);
        System.out.println(simplifyPath);
    }

    private static String simplifyPath(String path){
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String i : arr){
            if(i.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String i : stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}

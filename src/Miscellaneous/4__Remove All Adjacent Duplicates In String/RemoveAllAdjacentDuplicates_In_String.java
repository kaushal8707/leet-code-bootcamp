public class RemoveAllAdjacentDuplicates_In_String {
    public static void main(String[] args) {
        String input ="abbaca";  //azxxzy
        String removeDuplicates = removeDuplicates(input);
        System.out.println(removeDuplicates);
    }

    private static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c : s.toCharArray()){
            if(stack.length() > 0 &&
                   stack.charAt(stack.length()-1) == c){
                stack.deleteCharAt(stack.length()-1);
            }else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}

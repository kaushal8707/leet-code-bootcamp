public class Optimised_SolutionWith_On {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String removeStars = removeStars(s);
        System.out.println(removeStars);
    }
    public static String removeStars(String s){
        char arr[] = new char[s.length()];
        int i=0;
        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(c == '*'){
                i--;
            }else{
                arr[i]=c;
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<i; j++){
            sb.append(arr[j]);
        }
        return sb.toString();
    }
}
// TC and SC - O(n) bcz we took one character array string builder won't be count bcz we are putting anser into it
//   not performing any operations
// in earlier approach in string builder we are operating delete operation so there was some overhead of it.

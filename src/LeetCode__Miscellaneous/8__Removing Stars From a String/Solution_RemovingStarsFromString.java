public class Solution_RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String removeStars = removeStars(s);
        System.out.println(removeStars);
    }
    public static String removeStars(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '*'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

//so In stack we will push as soon as * will come we will pop
//TC and SC - O(n) bcz we are pushing in sb and based on starts we are popping
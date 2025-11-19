public class Solution_Great_String {
    public static void main(String[] args) {
        String s = "leEeetcode"; //abBAcC
        String makeGood = makeGood(s);
        System.out.println(makeGood);
    }

    private static String makeGood(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.length() > 0 &&
                    Math.abs(sb.charAt(sb.length()-1) - c)  == 32){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

//TC -O(n)
//SC - O(1)
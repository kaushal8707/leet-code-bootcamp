public class Solution_Get_Equal_Substrings_Within_Budget {
    public static void main(String[] args) {

        String s = "abcd";
        String t = "bcdf"; //"cdef"
        int maxCost = 3;
        int equalSubStringWithinBudget = equalSubString(s, t, maxCost);
        System.out.println(equalSubStringWithinBudget);

    }
    private static int equalSubString(String s, String t, int maxCost){
        int n = s.length();
        int left = 0;
        int window = 0;
        int ans = -1;
        for(int right=0; right<n; right++){
            window += Math.abs(s.charAt(right)-t.charAt(right));
            while(window > maxCost){
                window -= Math.abs(s.charAt(right)-t.charAt(right));
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}

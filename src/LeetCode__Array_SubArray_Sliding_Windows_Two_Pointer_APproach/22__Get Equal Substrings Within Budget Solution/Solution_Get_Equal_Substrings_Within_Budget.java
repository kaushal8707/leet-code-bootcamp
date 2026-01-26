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
            int left = 0; // Left pointer of the sliding window
            int currentCost = 0; // Total cost within the current window
            int maxLength = 0; // Maximum length found so far

            // Iterate through the strings with the right pointer
            for (int right = 0; right < n; right++) {
                // Calculate the cost of changing the current character and add to currentCost
                currentCost += Math.abs(s.charAt(right) - t.charAt(right));

                // If the current cost exceeds the budget, shrink the window from the left
                while (currentCost > maxCost) {
                    // Subtract the cost of the character at the left pointer
                    currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                    // Move the left pointer to the right
                    left++;
                }

                // Update the maximum length of the valid substring found so far
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
    }
}

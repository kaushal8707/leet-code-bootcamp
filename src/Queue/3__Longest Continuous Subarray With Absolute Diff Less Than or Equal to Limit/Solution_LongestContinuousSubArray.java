import java.util.Deque;
import java.util.LinkedList;

public class Solution_LongestContinuousSubArray {
    public static void main(String[] args) {
        int[] nums = {8,2,4,7};
        int limit = 4;
        int longestSubarray = longestSubarray(nums, limit);
        System.out.println(longestSubarray);
    }

    public static int longestSubarray(int[] nums, int limit) {
        // Deque to store elements in increasing order (front is min)
        Deque<Integer> minDeque = new LinkedList<>();
        // Deque to store elements in decreasing order (front is max)
        Deque<Integer> maxDeque = new LinkedList<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            int currentNum = nums[right];

            // Maintain the minDeque (remove larger elements from the back)
            while (!minDeque.isEmpty() && minDeque.peekLast() > currentNum) {
                minDeque.pollLast();
            }
            minDeque.addLast(currentNum);

            // Maintain the maxDeque (remove smaller elements from the back)
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < currentNum) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(currentNum);

            // Check if the current window is valid
            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                // If the window is invalid, shrink from the left
                // Remove the element at the 'left' pointer from the deques if it's the min or max
                if (maxDeque.peekFirst() == nums[left]) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() == nums[left]) {
                    minDeque.pollFirst();
                }
                // Move the left pointer to the right
                left++;
            }

            // Update the maximum length of a valid subarray found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

import java.util.Stack;

public class Solution_MonotonicStack {
    /**
     * Counts the number of valid contiguous subarrays where every element
     * is greater than or equal to the first element of that subarray.
     *
     * @param nums The input array of integers.
     * @return The total count of valid subarrays.
     */
    public static int countValidSubarrays(int[] nums) {
        int totalValidSubarrays = 0;
        // Stack stores indices of elements
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current element is smaller
            // than the element at the index on top of the stack,
            // it means the current element "blocks" valid subarrays
            // starting before it.
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                int poppedIndex = stack.pop();
                // The number of valid subarrays starting at poppedIndex
                // is the distance to the current "next smaller element" at index i.
                totalValidSubarrays += (i - poppedIndex);
            }
            stack.push(i);
        }

        // After iterating through the entire array, any indices remaining in the stack
        // have no smaller element to their right, meaning their valid subarrays
        // extend to the very end of the array.
        while (!stack.isEmpty()) {
            int poppedIndex = stack.pop();
            // The number of valid subarrays is the distance to the end of the array.
            totalValidSubarrays += (n - poppedIndex);
        }

        return totalValidSubarrays;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 2, 5, 3};
        System.out.println("Input: " + java.util.Arrays.toString(nums1));
        System.out.println("Number of Valid Subarrays: " + countValidSubarrays(nums1)); // Output: 11

        System.out.println("---");

        int[] nums2 = {3, 2, 1};
        System.out.println("Input: " + java.util.Arrays.toString(nums2));
        System.out.println("Number of Valid Subarrays: " + countValidSubarrays(nums2)); // Output: 3
    }
}

/**
The following Java code efficiently counts the number of valid subarrays using a monotonic stack.
A subarray is considered "valid" if its leftmost element is less than or equal to all other elements within that subarray.
This solution has a time complexity of O(n) and a space complexity of O(n), where n is the length of the input array.
 */
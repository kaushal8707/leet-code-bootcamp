import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class SmallestStringRobot {

    public String usingRobotToPrint(String s) {
        // Frequency count of remaining characters in 's'
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        char smallestRemaining = 'a'; // Tracks the smallest character not yet fully processed in 's'

        for (char c : s.toCharArray()) {
            // Decrement count for the current character as it's being "processed" from s
            counts.put(c, counts.get(c) - 1);

            // Update the overall smallest remaining character in 's'
            while (smallestRemaining <= 'z' && counts.getOrDefault(smallestRemaining, 0) == 0) {
                smallestRemaining++;
            }

            // Push the current character onto the stack (string t)
            stack.push(c);

            // Greedily pop from the stack if the top is less than or equal to the smallest
            // character still available in the remaining part of 's'. This ensures we take the
            // smallest possible character as soon as it's available.
            while (!stack.isEmpty() && stack.peek() <= smallestRemaining) {
                result.append(stack.pop());
            }
        }

        // After processing all of 's', any remaining characters in the stack
        // are appended to the result
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SmallestStringRobot solver = new SmallestStringRobot();

        String s1 = "zza";
        System.out.println("Input: " + s1 + ", Output: " + solver.usingRobotToPrint(s1)); // Output: azz

        String s2 = "bac";
        System.out.println("Input: " + s2 + ", Output: " + solver.usingRobotToPrint(s2)); // Output: abc

        String s3 = "bdda";
        System.out.println("Input: " + s3 + ", Output: " + solver.usingRobotToPrint(s3)); // Output: addb

        String s4 = "robot"; // Example from a source
        System.out.println("Input: " + s4 + ", Output: " + solver.usingRobotToPrint(s4)); // Output: bort
    }
}

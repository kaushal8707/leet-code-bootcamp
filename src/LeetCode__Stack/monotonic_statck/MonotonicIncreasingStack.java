import java.util.Stack;

public class MonotonicIncreasingStack {
    public static void main(String[] args) {
        int[] data = {3, 1, 4, 2, 5};
        Stack<Integer> increasingStack = buildMonotonicIncreasingStack(data);
        System.out.println("Monotonic Increasing Stack: " + increasingStack); // Expected output: [1, 2, 5]

        int[] data2 = {7, 2, 8, 1, 9, 3};
        Stack<Integer> increasingStack2 = buildMonotonicIncreasingStack(data2);
        System.out.println("Monotonic Increasing Stack 2: " + increasingStack2); // Expected output: [1, 3]
    }

    public static Stack<Integer> buildMonotonicIncreasingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int element : arr) {
            // While the stack is not empty and the top element is greater than or equal to the current element,
            // pop elements from the stack. This ensures the stack remains strictly increasing.
            while (!stack.isEmpty() && stack.peek() >= element) {
                stack.pop();
            }
            // Push the current element onto the stack.
            stack.push(element);
        }
        return stack;
    }
}

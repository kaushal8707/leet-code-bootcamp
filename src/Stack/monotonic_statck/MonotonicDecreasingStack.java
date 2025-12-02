import java.util.Stack;

public class MonotonicDecreasingStack {

    public static void main(String[] args) {
        Stack<Integer> monotonicStack = new Stack<>();

        // Example elements to add
        int[] elements = {5, 2, 8, 1, 6, 3, 7};

        for (int element : elements) {
            // While the stack is not empty and the top element is smaller than the current element,
            // pop elements to maintain the decreasing order.
            while (!monotonicStack.isEmpty() && monotonicStack.peek() < element) {
                monotonicStack.pop();
            }
            // Push the current element onto the stack.
            monotonicStack.push(element);
            System.out.println("Stack after adding " + element + ": " + monotonicStack);
        }

        // The stack now contains elements in monotonic decreasing order
        System.out.println("\nFinal Monotonic Decreasing Stack: " + monotonicStack);
    }
}
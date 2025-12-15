import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    MinStack(){
        mainStack = new Stack();
        minStack = new Stack();
    }
    public void push(int val) {
        mainStack.push(val);
        // Push to minStack if empty or if new element is less than or equal to current min
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        // Otherwise, push the current min again to maintain the minimum for the corresponding mainStack state
        minStack.push(minStack.peek());
    }
    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop(); // Pop from minStack as well to keep states synchronized
        }
    }
    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new IllegalStateException("Stack is empty.");
    }
    public int getMin(){
        return minStack.peek();
    }

    // Example usage in a main class
        public static void main(String[] args) {
            MinStack stack = new MinStack();
            stack.push(5);
            stack.push(3);
            stack.push(7);
            System.out.println("Current Min: " + stack.getMin()); // Output: 3
            stack.push(2);
            System.out.println("Current Min: " + stack.getMin()); // Output: 2
            stack.pop();
            System.out.println("Top element: " + stack.top()); // Output: 7
            System.out.println("Current Min after pop: " + stack.getMin()); // Output: 3
        }
}

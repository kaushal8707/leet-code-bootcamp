import java.util.Stack;

public class MyQueue_RecommendedApproach_Amortized_O_1 {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    public MyQueue_RecommendedApproach_Amortized_O_1() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    /** Push element x to the back of queue. */
    public void push(int x){
        inputStack.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop(){
        if(outputStack.isEmpty()){
            transferElements();
        }
        return outputStack.pop();
    }
    /** Get the front element. */
    public int peek() {
        if (outputStack.isEmpty()) {
            transferElements();
        }
        return outputStack.peek();
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
    /** Helper method to transfer elements from inputStack to outputStack */
    public void transferElements(){
        while (!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println("Peek: " + q.peek()); // Expected: 1
        System.out.println("Pop: " + q.pop());   // Expected: 1
        q.push(3);
        System.out.println("Peek: " + q.peek()); // Expected: 2
        System.out.println("Pop: " + q.pop());   // Expected: 2
        System.out.println("Empty: " + q.empty()); // Expected: false
        System.out.println("Pop: " + q.pop());   // Expected: 3
        System.out.println("Empty: " + q.empty()); // Expected: true
    }
}

//TC - O(1)
//SC - O(1)
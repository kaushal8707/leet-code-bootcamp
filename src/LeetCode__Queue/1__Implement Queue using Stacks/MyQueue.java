import java.util.Stack;
public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    MyQueue(){
        stack1=new Stack();
        stack2=new Stack();
    }

    public void push(int x){
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack2.push(x);
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    public int pop(){
        return stack2.pop();

    }
    public int peek(){
        return stack2.peek();
    }
    public boolean empty(){
        return stack2.isEmpty();
    }

        public static void main(String[] args) {
            MyQueue q = new MyQueue();
            q.push(1);
            q.push(2);
            q.push(3);

            System.out.println("Front element is: " + q.peek()); // Output: 1
            System.out.println("Removed element is: " + q.pop()); // Output: 1
            System.out.println("Removed element is: " + q.pop()); // Output: 2
            System.out.println("Is queue empty? " + q.empty()); // Output: false

            q.push(4);
            System.out.println("Removed element is: " + q.pop()); // Output: 3
            System.out.println("Removed element is: " + q.pop()); // Output: 4
            System.out.println("Is queue empty? " + q.empty()); // Output: true
        }
}

// when new element ll come we will popped all elements from stack 2 to stack 1 and then push new elements to stack 2
// and then popped all elements from stack 1 to stack 2
// stack 1 work like a helper stack
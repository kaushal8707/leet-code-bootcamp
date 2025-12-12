import java.util.LinkedList;
import java.util.Queue;
/** queue2 will behave like a stack
 * we have to implement LIFO NOT FIFO
 * */

public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack(){
        this.queue1= new LinkedList();
        this.queue2= new LinkedList();
    }
    public void push(int x){
        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
    }
    public int pop(){
        return queue2.poll();   /**queue2 will behave like a stack , poll is like pop*/
    }
    public int top(){
        return queue2.peek();
    }
    public boolean empty(){
        return queue2.isEmpty();
    }
    /** Returns the number of elements in the stack. */
    public int size() {
        return queue2.size();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Expected: 30
        System.out.println("Stack size: " + stack.size()); // Expected: 3

        System.out.println("Popped element: " + stack.pop()); // Expected: 30
        System.out.println("Top element: " + stack.top()); // Expected: 20
        System.out.println("Stack size: " + stack.size()); // Expected: 2

        stack.push(40);
        System.out.println("Top element: " + stack.top()); // Expected: 40
        System.out.println("Stack size: " + stack.size()); // Expected: 3
    }
}

// Time Complexity - O(n)
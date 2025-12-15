import java.util.LinkedList;
import java.util.Queue;
/** stack implementation using same queue */
public class ImplementStackUsing_OnlyOneQueue {
    Queue<Integer> queue;
    public ImplementStackUsing_OnlyOneQueue(){
        this.queue= new LinkedList();
    }
    public void push(int x){
        int size = queue.size();
        queue.add(x);
        while(size-- > 0){
            queue.add(queue.poll());
        }
    }
    public int pop(){
        return queue.poll();
    }
    public int top(){
        return queue.peek();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
    public int size() {
        return queue.size();
    }
    public static void main(String[] args) {
        ImplementStackUsing_OnlyOneQueue stack = new ImplementStackUsing_OnlyOneQueue();
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
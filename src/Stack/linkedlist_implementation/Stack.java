public class Stack {
    Node top;                          // Represents the top of the stack
    int size;                          // Stores the current size of the stack
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;          // Initially, a new node points to null
        }
    }
    Stack(){
        top = null;
        size = 0;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){        // Pushed an element onto the stack
        Node node = new Node(data);
        node.next = top;               // New node points to the current top
        top = node;                    // New node becomes the new to
        size++;
    }
    public int pop(){                  // Pops an element from the stack
        if(isEmpty()){
            System.out.println("Stack Underflow: Cannot pop from an empty stack.");
            return -1; // Or throw an exception
        }
        int poppedElement  = top.data;   // Get data from the top node
        top = top.next;                  // Move top to the next node
        size--;
        return poppedElement;
    }
    public int peek() {                // Peeks at the top element of the stack without removing it
        if (isEmpty()) {
            System.out.println("Stack is Empty: No element to peek.");
            return -1;                // Or throw an exception
        }
        return top.data;
    }
    public int size() {                 // Returns the current size of the stack
        return size;
    }
    public void display(){              // Displays the elements of the stack (from top to bottom)
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack elements (top to bottom): ");
        while(current != null){
            System.out.print(current.data+"   ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek()); // Expected: 30
        System.out.println("Stack size: " + stack.size());  // Expected: 3

        System.out.println("Popping an element: " + stack.pop()); // Expected: 30
        stack.display(); // Expected: 20 10

        System.out.println("Top element after pop: " + stack.peek()); // Expected: 20
        System.out.println("Stack size after pop: " + stack.size());  // Expected: 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: false

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty after all pops? " + stack.isEmpty()); // Expected: true
        stack.pop();                        // Attempt to pop from an empty stack
    }
}
package array_implementation;

import java.util.NoSuchElementException;

public class Stack {
    int arr[];
    int top;               // Index of the top element
    int capacity;
    Stack(int size){
        capacity = size;
        top = -1;         // Stack is initially empty
        arr = new int[capacity];
    }
    public void push(int item){
        if(isFull()){
            throw new StackOverflowError("Stack is Full, Can't push element - "+item);
        }
        arr[++top] = item;
        System.out.println("pushed element - "+item);
    }
    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is Empty, Cannot Pop.");
        }
        int popped = arr[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }
    public int peek(){                   // Peek at the top element without removing it

        if(isEmpty()){
            throw new NoSuchElementException("Stack is Empty, Cannot Peek.");
        }
        return arr[top];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
        }
        for(int i = top; i > -1; i--){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity - 1;
    }
    public int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);                             //stack size : 5
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.display();

        System.out.println("Peeked element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }
}

package seld_try;
// Linked List Cycle - Floyd's Tortoise and Hare
class Node{
    int data;
    Node ref;
    Node(int data){
        this.data=data;
        this.ref=null;
    }
    Node(int data, Node next){
        this.data=data;
        this.ref=next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", ref=" + ref +
                '}';
    }
}

public class ReverseListIterative_Approach_I {
    private static void print_list(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        if(head.ref==null){
            System.out.println(head.data);
        }
        while(head!=null){
            System.out.print(head.data+"  ");
            head=head.ref;
        }
    }
    private static void reverseLinkedList(Node head) {   //  Null 1 -> 2 -> 3 -> 4 -> 5
        Node previous = null;
        Node current = head;
        while(current!=null){
            Node tempNode = current.ref;
            current.ref=previous;
            previous=current;
            current=tempNode;
        }
        print_list(previous);
    }

    public static void main(String[] args) {
        Node head = new Node(1,
             new Node(2,
                     new Node(3,
                             new Node(4,
                                     new Node(5, null)))));
        reverseLinkedList(head);
    }
}

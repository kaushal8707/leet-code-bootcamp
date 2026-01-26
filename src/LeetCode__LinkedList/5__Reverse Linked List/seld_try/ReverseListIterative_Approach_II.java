package seld_try;

// Linked List Cycle - Floyd's Tortoise and Hare
class Node2{
    int data;
    Node2 ref;
    Node2(int data){
        this.data=data;
        this.ref=null;
    }
    Node2(int data,Node2 next){
        this.data=data;
        this.ref=next;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "data=" + data +
                ", ref=" + ref +
                '}';
    }
}

public class ReverseListIterative_Approach_II {
    private static void print_list(Node2 head){
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
    public static int size(Node2 head){
        Node2 current=head;
        int size=0;
        while(current!=null){
            current=current.ref;
            size++;
        }
        return size;
    }
    private static Node2 reverseLinkedList(Node2 head) {   //  Null 1 -> 2 -> 3 -> 4 -> 5
        Node2 previous = new Node2(0,head);
        Node2 dummy=previous;
        Node2 current = head;
//        int size = size(head);
//        for(int i=0; i < size-1; i++){             //  1 -> 2 -> 3 -> 4 -> 5
//            Node2 nextNode = current.ref; // The node to be moved
//            current.ref = nextNode.ref;     // 'curr' links to the node after 'nextNode'
//            nextNode.ref = previous.ref;     // 'nextNode' links to the current first node of the sublist
//            previous.ref = nextNode;          // 'prev' links to 'nextNode', making it the new first node
//        }
        while(current.ref!=null){
                Node2 nextNode = current.ref; // The node to be moved
                current.ref = nextNode.ref;     // 'curr' links to the node after 'nextNode'
                nextNode.ref = previous.ref;     // 'nextNode' links to the current first node of the sublist
                previous.ref = nextNode;          // 'prev' links to 'nextNode', making it the new first node
        }
        return dummy.ref;
    }

    public static void main(String[] args) {
        Node2 head = new seld_try.Node2(1,
                new Node2(2,
                        new Node2(3,
                                new Node2(4,
                                        new Node2(5, null)))));
        Node2 reverseLinkedList = reverseLinkedList(head);
        System.out.println(reverseLinkedList);
    }
}

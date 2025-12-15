public class Solution_Middle_of_the_Linked_List {
    Node head;

    private void insertAtHead(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**  Method to find the middle element of the linked list */
    private Node findMiddle(){
        Node slow_ptr = head;
        Node fast_ptr = head;
        while(fast_ptr != null && fast_ptr.next != null){          // as we are traversing on fast_ptr.next.next that's why check fast_ptr.next  should not be null otw will throw NullPointerException
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        System.out.println("The middle element is : "+slow_ptr.data);
        return slow_ptr;
    }


     private void printElements(){
        Node node = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(node != null){
            System.out.print(node.data+"  ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Solution_Middle_of_the_Linked_List ll = new Solution_Middle_of_the_Linked_List();
        ll.insertAtHead(1);
        ll.insertAtHead(2);
        ll.insertAtHead(3);
        ll.insertAtHead(4);
        ll.insertAtHead(2);
        Node middle = ll.findMiddle();
        System.out.println(middle.data+"-"+middle.next.data);
        System.out.println("-------------");
        ll.printElements();
    }
}

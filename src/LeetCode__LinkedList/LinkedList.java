public class LinkedList {
    Node head;

    /** Method to add a new node to the linked list */
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;   // New node points to the old head
        head = newNode;        // New node becomes the new head
    }

    /** Method deletion at the beginning */
    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;       // Simply move the head to the next node
    }

    /** Method to search for an element */
    public boolean search(int key) {
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

        /** Method Deletion of a Specific Node (by value) */
    public void deleteNode(int key){
        Node temp = head, prev = null;
        if(temp != null && temp.data == key){              // If head node itself holds the key to be deleted
            head = temp.next;                              // changed head
            return;
        }

        if(temp != null && temp.data != key) {             // Search for the key to be deleted, keeping track of the previous node
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;                          // If key was not present in linked list

        prev.next = temp.next;                             // Unlink the node from linked list
    }

    public Node deleteSpecificNode(Node n) {
        Node current=head;
        if(current==null){
            System.out.println("list is empty!!");
        }
        while(current.next!=null ){
            if(current.next.data==n.data){
                current.next=current.next.next;
            }
            current=current.next;
        }
        return head;
    }

    /** Method Insertion at a Specific Position/Index */
    public void insertAtIndex(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            insertAtHead(data);
            return;
        }
        Node current = head;
        for(int i = 0; i < index - 1 && current != null; i++){          // this condition current != null while we have 5 elements and giving index 10
            current = current.next;
        }

        if (current == null) {                                           // this condition current != null while we have 5 elements
            System.out.println("Index out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    /** Method to print the linked list */
    public void printLinkedList(){
        Node temp = head;
        while( temp != null){
            System.out.println(temp.data+"  ");
            temp = temp.next;
        }
    }

    /** Method Deletion at a Specific Position */
    public void deleteAtPosition(int position) {
        if(head == null){
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if(position == 0) {         // If head needs to be removed
            head = head.next;
            return;
        }
        Node temp = head;
         for(int i = 0; temp != null && i < position - 1; i++) {        // Traverse to the node just before the desired position
            temp = temp.next;
         }
        if(temp == null || temp.next == null) {            // If position is out of bounds
            System.out.println("Position out of bounds.");
            return;
        }
        temp.next = temp.next.next;            // Unlink the node at the given position
    }

    /** Method to insert a new node at end of linked list */
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    /** Method to find the middle element of the linked list */



    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(11);
        linkedList.insertAtHead(12);
        linkedList.insertAtHead(13);
        linkedList.insertAtHead(14);
        linkedList.insertAtEnd(99);
        System.out.println(linkedList.search(19));
        linkedList.insertAtIndex(222,4);
        linkedList.insertAtIndex(111,3);   // Index Out Of Bound Exception
        linkedList.printLinkedList();
        System.out.println("=============================");
        linkedList.deleteAtBeginning();
        linkedList.deleteNode(12);
        linkedList.deleteAtPosition(2);

        linkedList.printLinkedList();
        linkedList.deleteSpecificNode(new Node(222));
        linkedList.printLinkedList();

    }
}

public class Iterative_Reverse_Linked_List {

    // Function to reverse the linked list
    public Node reverseList(Node head) {
        Node previous = null; // Pointer to the previous node
        Node current = head;  // Pointer to the current node
        Node nextNode = null; // Pointer to the next node

        while (current != null) {
            nextNode = current.next; // Store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;      // Move 'previous' one step forward
            current = nextNode;      // Move 'current' one step forward
        }
        return previous; // 'previous' will be the new head of the reversed list
    }

    // Function to print the linked list
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Iterative_Reverse_Linked_List list = new Iterative_Reverse_Linked_List();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        list.printList(head);

        // Reverse the linked list
        head = list.reverseList(head);

        System.out.print("Reversed Linked List: ");
        list.printList(head);
    }
}

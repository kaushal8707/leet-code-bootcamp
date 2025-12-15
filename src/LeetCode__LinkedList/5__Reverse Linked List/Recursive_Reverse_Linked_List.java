public class Recursive_Reverse_Linked_List {

    public Node reverseListRecursive(Node head) {
        // Base case: if the list is empty or has only one node, it is already reversed
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list starting from head.next
        Node newHead = reverseListRecursive(head.next);

        // Reverse the link: make the next node point back to the current head
        head.next.next = head;

        // Set the current head's next pointer to null, as it will be the last node in the reversed list
        head.next = null;

        // Return the new head (which is the original tail of the list)
        return newHead;
    }

    // Function to print the linked list
    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Recursive_Reverse_Linked_List list = new Recursive_Reverse_Linked_List();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        list.print(head);

        // Reverse the linked list
        head = list.reverseListRecursive(head);

        System.out.print("Reversed Linked List: ");
        list.print(head);
    }
}

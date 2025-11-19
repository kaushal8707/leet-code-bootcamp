public class Solution_Remove_Linked_List_Elements {

    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head of the original list.
        // This simplifies handling cases where the head itself needs to be removed.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // Initialize a 'prev' pointer to the dummy node.
        // 'prev' will always point to the node *before* the current node being examined.
        ListNode prev = dummy;
        // Initialize a 'current' pointer to the head of the original list.
        ListNode current = head;

        // Iterate through the linked list
        while (current != null) {
            if (current.data == val) {
                // If the current node's value matches the target value,
                // skip it by linking 'prev.next' to 'current.next'.
                // This effectively removes 'current' from the list.
                prev.next = current.next;
            } else {
                // If the current node's value does not match the target,
                // move 'prev' forward to 'current'.
                prev = current;
            }
            // Move 'current' to the next node in the list.
            current = current.next;
        }

        // The new head of the modified list is 'dummy.next'.
        return dummy.next;
    }
        // Function to print the linked list
    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution_Remove_Linked_List_Elements list = new Solution_Remove_Linked_List_Elements();
        int val = 6;
        int val1 = 7;

        // Create a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 6      1 -> 2 -> 6 -> 6 -> 3 -> 4 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(6);

        //second example
        // Create a sample linked list: 7 -> 7 -> 7 -> 7
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(7);
        head1.next.next = new ListNode(7);
        head1.next.next.next = new ListNode(7);


        System.out.print("Original Linked List: ");
        list.print(head);  //head1

        // Remove elements from a LinkedList for a given value
        head = list.removeElements(head, val);   //head1, val1

        System.out.print("Remove elements from a LinkedList for a given value: ");
        list.print(head);
    }
}

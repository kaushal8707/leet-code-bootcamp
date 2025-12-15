/** Approach : slow and fast pointer approach */

public class Solution_Deleting_the_Middle_Node_of_a_Linked_List {

    public ListNode deleteMiddle(ListNode head) {
        // Handle edge case: if the list has only one node or is empty, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize three pointers:
        // 'slow' moves one step, 'fast' moves two steps.
        // 'prev' tracks the node before 'slow'.
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        // Move the fast pointer twice as fast as the slow pointer.
        // The condition `fast != null && fast.next != null` ensures we stop
        // when 'fast' reaches or goes past the end of the list.
        while (fast != null && fast.next != null) {
            prev = slow;         // Update 'prev' to the current 'slow' node
            slow = slow.next;    // Move 'slow' one step
            fast = fast.next.next; // Move 'fast' two steps
        }
        // When the loop finishes, 'slow' points to the middle node,
        // and 'prev' points to the node right before it.

        // Delete the middle node by updating the 'next' pointer of the previous node.
        // This bypasses the 'slow' node.
        prev.next = slow.next;

        // Return the head of the modified list.
        return head;
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
        Solution_Deleting_the_Middle_Node_of_a_Linked_List list = new Solution_Deleting_the_Middle_Node_of_a_Linked_List();
        // Create a sample linked list: 1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next .next.next= new ListNode(2);
        head.next.next.next .next.next.next= new ListNode(6);

        System.out.print("Original Linked List  : ");
        list.print(head);

        // Reversed Linked List Between Given Left and Right Index/Positions
        head = list.deleteMiddle(head);

        System.out.print("Deletion of a middle Node from a Linked List  ");
        list.print(head);
    }
}

public class Solution_Odd_Even_Linked_List {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No changes needed for empty or single-node lists
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Store the head of the even list to append later

        while (even != null && even.next != null) {
            odd.next = even.next; // Connect odd node to the next odd node
            odd = odd.next;       // Move odd pointer forward

            even.next = odd.next; // Connect even node to the next even node
            even = even.next;     // Move even pointer forward
        }

        odd.next = evenHead; // Append the even list to the end of the odd list
        return head;         // Return the original head, which is now the head of the reordered list
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
        Solution_Odd_Even_Linked_List linkedList = new Solution_Odd_Even_Linked_List();
        // Create a sample linked list: 2 -> 1 -> 3 -> 5 -> 6 -> 4 -> 7
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
        System.out.println("Original Linked List");
        linkedList.print(head);

        linkedList.oddEvenList(head);

        System.out.println("Modified Odd Even Linked List");
        linkedList.print(head);
    }
}

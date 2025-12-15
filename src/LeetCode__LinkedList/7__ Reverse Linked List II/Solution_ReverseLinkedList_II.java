
public class Solution_ReverseLinkedList_II {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        // Create a dummy node to handle edge cases, especially when left == 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        // Move `prev` to the node just before the sublist [left, right]
        for(int i=0; i < left - 1; i++){
            previous = previous.next;
        }
        // `curr` will point to the first node of the sublist (at position 'left')
        ListNode current = previous.next;
        // Reverse the sublist one node at a time
        // The number of reversals needed is (right - left)
        for(int i=0; i < right - left; i++){
            ListNode nextNode = current.next; // The node to be moved
            current.next = nextNode.next;     // 'curr' links to the node after 'nextNode'
            nextNode.next = previous.next;     // 'nextNode' links to the current first node of the sublist
            previous.next = nextNode;          // 'prev' links to 'nextNode', making it the new first node
        }
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
        Solution_ReverseLinkedList_II list = new Solution_ReverseLinkedList_II();
        int left = 2;  //1
        int right = 4;  // 1

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original Linked List: ");
        list.print(head);

        // Reversed Linked List Between Given Left and Right Index/Positions
        head = list.reverseBetween(head, left, right);

        System.out.print("Reversed Linked List Between Given Left and Right Index/Positions: ");
        list.print(head);
    }
}

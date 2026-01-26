public class Reverse_Nodes_In_Even_Length_Group {

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy; // Pointer to the node *before* the current group
        ListNode current = head; // Head of the current group
        int groupLength = 1; // Current group length

        while (current != null) {
            ListNode groupStart = current;
            ListNode groupEnd = current;
            int currentGroupSize = 1;

            // Find the end of the current group and its actual size
            while (groupEnd.next != null && currentGroupSize < groupLength) {  // 1 2 3 4 5 6 7 8 9 10
                groupEnd = groupEnd.next;
                currentGroupSize++;
            }

            // If the group length is even, reverse it
            if (currentGroupSize % 2 == 0) {
                ListNode nextGroupStart = groupEnd.next;
                groupEnd.next = null; // Disconnect the group for reversal

                ListNode reversedHead = reverseList(groupStart);

                prev.next = reversedHead; // Connect previous part to reversed group
                groupStart.next = nextGroupStart; // Connect reversed group's tail to next group
                prev = groupStart; // Update prev to the new tail of the reversed group
                current = nextGroupStart; // Move to the start of the next group
            } else {
                // If the group length is odd, no reversal needed
                prev = groupEnd; // Update prev to the end of the current group
                current = groupEnd.next; // Move to the start of the next group
            }
            groupLength++; // Increment group length for the next iteration
        }
        return dummy.next;
    }

    // Function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        Reverse_Nodes_In_Even_Length_Group list = new
                Reverse_Nodes_In_Even_Length_Group();
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        System.out.print("Original Linked List: ");
        list.printList(head);

        head = list.reverseEvenLengthGroups(head);

        System.out.print("Reversed Linked List: ");
        list.printList(head);
    }
}

public class Solution_Swapping_Nodes_in_a_Linked_List {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
//        ListNode current = head;
        // Find the k-th node from the beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        // Find the k-th node from the end
        // Move 'current' until it reaches the end, while moving 'second'
        // such that it's k nodes behind 'current'.
        // When 'current' is at the k-th node from the beginning,
        // 'second' is at the head.
        // As 'current' moves to the end, 'second' will move to the k-th node from the end.
        ListNode temp = first; // Use a temporary pointer to traverse to the end
        while (temp.next != null) {
            second = second.next;
            temp = temp.next;
        }
        // Swap the values of the two found nodes
        int val = first.data;
        first.data = second.data;
        second.data = val;
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
        Solution_Swapping_Nodes_in_a_Linked_List list = new Solution_Swapping_Nodes_in_a_Linked_List();
        int k = 2;

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        //second example
        // Create a sample linked list: 7 -> 9 -> 6 -> 2 -> 7 -> 8 -> 3 -> 0
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(7);
        head1.next.next.next.next.next = new ListNode(8);
        head1.next.next.next.next.next.next = new ListNode(3);
        head1.next.next.next.next.next.next.next = new ListNode(0);

        System.out.print("Original Linked List: ");
        list.print(head);  //head1

        // Swapping Nodes in a given Linked List for a given Index Value
        head = list.swapNodes(head, k);   //head1, k1

        System.out.print("Swapping Nodes in a given Linked List for a given Index Value    ");
        list.print(head);  //head1
    }
}

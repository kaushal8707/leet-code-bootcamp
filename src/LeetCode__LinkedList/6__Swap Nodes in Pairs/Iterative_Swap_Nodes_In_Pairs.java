public class Iterative_Swap_Nodes_In_Pairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {  // Handle edge cases: empty list or single-node list
            return head;
        }
        // Use a dummy node to handle the edge case where the original head is swapped
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        // Loop until there are at least two nodes to swap
        while(head != null && head.next != null){
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            // Swapping logic
            previous.next = secondNode;          // 1. Link the previous node to the second node
            firstNode.next = secondNode.next;    // 2. Link the first node to the node after the second node (start of next pair)
            secondNode.next = firstNode;         // 3. Link the second node back to the first node
            // Move the pointers to the next pair
            previous = firstNode;                // The first node is now the end of the swapped pair
            head = firstNode.next;               // Head moves to the start of the next pair
        }
        // The new head of the list is the next of the dummy node
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

    public static void main(String[] args) {
        Iterative_Swap_Nodes_In_Pairs list = new Iterative_Swap_Nodes_In_Pairs();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original Linked List: ");
        list.printList(head);

        // Swapped Nodes in Pairs in the linked list
        head = list.swapPairs(head);

        System.out.print("Swapped Nodes in Pairs in the linked list: ");
        list.printList(head);
    }
}

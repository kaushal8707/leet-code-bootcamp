public class Recursive_Swap_Nodes_In_Pairs {

    public ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, no swap needed
        if (head == null || head.next == null) {
            return head;
        }
        // Store the second node (which will become the new head of the pair)
        ListNode secondNode = head.next;
        // Recursively swap the rest of the list (starting from the third node)
        // and link the first node to the result
        head.next = swapPairs(secondNode.next);
        // Point the second node to the first node to complete the swap of the current pair
        secondNode.next = head;
        // Return the new head of the swapped pair (the original second node)
        return secondNode;
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
        Recursive_Swap_Nodes_In_Pairs list = new Recursive_Swap_Nodes_In_Pairs();

        // Create a sample linked list: 11 -> 22 -> 33 -> 44 -> 55
        ListNode head = new ListNode(11);
        head.next = new ListNode(22);
        head.next.next = new ListNode(33);
        head.next.next.next = new ListNode(44);
        head.next.next.next.next = new ListNode(55);

        System.out.print("Original Linked List: ");
        list.printList(head);

        // Swapped Nodes in Pairs in the linked list
        head = list.swapPairs(head);

        System.out.print("Swapped Nodes in Pairs in the linked list: ");
        list.printList(head);
    }
}

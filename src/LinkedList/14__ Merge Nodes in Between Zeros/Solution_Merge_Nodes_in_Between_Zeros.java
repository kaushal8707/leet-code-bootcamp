public class Solution_Merge_Nodes_in_Between_Zeros {

    public ListNode mergeNodes(ListNode head) {
        // 'dummy' acts as a placeholder for the head of the new list to simplify insertions.
        ListNode dummy = new ListNode(0);
        // 'ans' will be the pointer we use to build the new list.
        ListNode ans = dummy;
        // 'curr' starts from the node after the first 0, as the first node is guaranteed to be 0.
        ListNode curr = head.next;
        int sum = 0;

        while (curr != null) {
            if (curr.data != 0) {
                // Accumulate sum if the node value is not zero.
                sum += curr.data;
            } else {
                // When a 0 is encountered, we've reached the end of a segment.
                // Create a new node with the accumulated sum and append it to the new list.
                ans.next = new ListNode(sum);
                ans = ans.next;
                // Reset the sum for the next segment.
                sum = 0;
            }
            // Move to the next node in the original list.
            curr = curr.next;
        }

        // Return the head of the new list (skipping the dummy node).
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
        Solution_Merge_Nodes_in_Between_Zeros list = new Solution_Merge_Nodes_in_Between_Zeros();
        // Create a sample linked list: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);
        ListNode node = list.mergeNodes(head);
        list.print(node);
    }
}

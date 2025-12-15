public class Solution_Remove_Duplicates_from_Sorted_List_II {

    public ListNode deleteDuplicates(ListNode head){
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0); // Create a dummy node to handle edge cases
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Check if there are duplicates starting from curr
            boolean isDuplicate = false;
            while (curr.next != null && curr.data == curr.next.data) {
                curr = curr.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                // If duplicates were found, skip all of them
                prev.next = curr.next;
            } else {
                // If no duplicates, move prev forward
                prev = prev.next;
            }
            curr = curr.next; // Move curr to the next node
        }
        return dummy.next;
    }

    // Helper function to print the linked list
    public void printList(ListNode head){
        if(head == null){
            System.out.println("List is empty !!");
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"   ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution_Remove_Duplicates_from_Sorted_List_II sortedList = new Solution_Remove_Duplicates_from_Sorted_List_II();
        // Example 1:     1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5)))))));
        System.out.print("Original list 1: ");
        sortedList.printList(head1);
        ListNode result1 = sortedList.deleteDuplicates(head1);
        System.out.print("List after removing duplicates 1: ");
        sortedList.printList(result1);    // Expected: 1 2

        // Example 2:      1 -> 1 -> 1 -> 2 -> 3
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        System.out.print("Original list 2: ");
        sortedList.printList(head2);
        ListNode result2 = sortedList.deleteDuplicates(head2);
        System.out.print("List after removing duplicates 2: ");
        sortedList.printList(result2);  // Expected: 1 2 3
    }
}

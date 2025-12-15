public class Solution_Remove_Duplicates_from_Sorted_List {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null){
            return head;                           // No duplicates possible or only one node
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;               // If current and next have the same value, skip the next node
            }else{
                current = current.next;                         // If values are different, move to the next node
            }
        }
        return head;
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
        Solution_Remove_Duplicates_from_Sorted_List sortedList = new Solution_Remove_Duplicates_from_Sorted_List();

        // Example 1: 1 -> 1 -> 2
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.print("Original list 1: ");
        sortedList.printList(head1);
        ListNode result1 = sortedList.deleteDuplicates(head1);
        System.out.print("List after removing duplicates 1: ");
        sortedList.printList(result1);    // Expected: 1 2

        // Example 2: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        System.out.print("Original list 2: ");
        sortedList.printList(head2);
        ListNode result2 = sortedList.deleteDuplicates(head2);
        System.out.print("List after removing duplicates 2: ");
        sortedList.printList(result2);  // Expected: 1 2 3

        // Example 3: Empty list
        ListNode head3 = null;
        System.out.print("Original list 3: ");
        sortedList.printList(head3);
        ListNode result3 = sortedList.deleteDuplicates(head3);
        System.out.print("List after removing duplicates 3: ");
        sortedList.printList(result3); // Expected: (empty)

        // Example 4: Single node list
        ListNode head4 = new ListNode(5);
        System.out.print("Original list 4: ");
        sortedList.printList(head4);
        ListNode result4 = sortedList.deleteDuplicates(head4);
        System.out.print("List after removing duplicates 4: ");
        sortedList.printList(result4); // Expected: 5
    }
}

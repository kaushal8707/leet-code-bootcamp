public class Iterative_Palindrome_Linked_List {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single-node list is a palindrome
        }

        // Step 1: Find the middle of the linked list using slow and fast pointers.
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list.
        // If the list has an odd number of nodes, 'slow' will be at the middle node.
        // We start reversing from 'slow' for both odd and even length lists.
        Node secondHalfHead = reverseList(slow);

        // Step 3: Compare the first half and the reversed second half.
        Node firstHalfPointer = head;
        Node secondHalfPointer = secondHalfHead; // Use a separate pointer for comparison

        while (secondHalfPointer != null) {
            if (firstHalfPointer.data != secondHalfPointer.data) {
                // Optionally, reverse the second half back to restore the original list
                // reverseList(secondHalfHead);
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        // Optionally, reverse the second half back to restore the original list
        // reverseList(secondHalfHead);
        return true;
    }

    /**
     * Reverses a singly linked list.
     *
     * @param head The head node of the list to be reversed.
     * @return The new head node of the reversed list.
     */
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move prev to current node
            current = next;      // Move current to next node
        }
        return prev; // prev is now the new head of the reversed list
    }

    public static void main(String[] args) {
        // Example 1: Palindrome list
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(1);
        System.out.println("Is list 1 a palindrome: " + isPalindrome(head1)); // Expected: true

        // Example 2: Non-palindrome list
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        System.out.println("Is list 2 a palindrome: " + isPalindrome(head2)); // Expected: false

        // Example 3: Single node list
        Node head3 = new Node(5);
        System.out.println("Is list 3 a palindrome: " + isPalindrome(head3)); // Expected: true

        // Example 4: Empty list
        Node head4 = null;
        System.out.println("Is list 4 a palindrome: " + isPalindrome(head4)); // Expected: true

    }
}

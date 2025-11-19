public class Recursive_Palindrome_Linked_List {

    private ListNode leftPointer; // This will act as the "left" pointer for comparison

    public boolean isPalindrome(ListNode head) {
        leftPointer = head; // Initialize the left pointer to the head
        return checkPalindromeRecursive(head);
    }

    private boolean checkPalindromeRecursive(ListNode rightPointer) {
        // Base case: If the right pointer reaches the end of the list, it's a palindrome so far
        if (rightPointer == null) {
            return true;
        }

        // Recursively check the rest of the list
        boolean isSubListPalindrome = checkPalindromeRecursive(rightPointer.next);

        // If the sub-list is not a palindrome, or we've already found a mismatch
        if (!isSubListPalindrome) {
            return false;
        }

        // Compare the values of the left and right pointers
        if (leftPointer.data != rightPointer.data) {
            return false; // Mismatch found
        }

        // Move the left pointer forward for the next comparison
        leftPointer = leftPointer.next;

        return true; // Values match, continue checking
    }

    // Example Usage:
    public static void main(String[] args) {
        // Create a palindrome linked list: 1 -> 2 -> 2 -> 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        Recursive_Palindrome_Linked_List checker = new Recursive_Palindrome_Linked_List();
        System.out.println("Is 1->2->2->1 a palindrome? " + checker.isPalindrome(head1)); // Expected: true

        // Create a non-palindrome linked list: 1 -> 2 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.println("Is 1->2->3 a palindrome? " + checker.isPalindrome(head2)); // Expected: false
    }
}

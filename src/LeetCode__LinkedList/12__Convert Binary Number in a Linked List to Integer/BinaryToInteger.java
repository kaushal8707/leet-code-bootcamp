public class BinaryToInteger {

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null){
            result = result * 2 + head.data;
            head = head.next;
        }
        return result;
    }
        // Example Usage:
    public static void main(String[] args) {

        // Create a linked list: 1 -> 0 -> 1 (binary "101")
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        int decimalValue = getDecimalValue(head);
        System.out.println("The decimal value of the binary linked list is: " + decimalValue); // Output: 5

        // Create another linked list: 1 -> 1 -> 1 (binary "111")
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(1);

        int decimalValue2 = getDecimalValue(head2);
        System.out.println("The decimal value of the binary linked list is: " + decimalValue2); // Output: 7

        // Create another linked list: 0 -> 1 -> 1 (binary "011")
        ListNode head3 = new ListNode(0);
        head3.next = new ListNode(1);
        head3.next.next = new ListNode(1);

        int decimalValue3 = getDecimalValue(head3);
        System.out.println("The decimal value of the binary linked list is: " + decimalValue3); // Output: 3
    }
}

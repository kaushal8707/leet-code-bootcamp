public class Solution_LinkedListCycle_Floyds_Tortoise_and_Hare {

    public boolean hasCycle(Node head) {                   /** If the fast pointer reaches null, there is no cycle */

     if(head == null || head.next == null){
            return false; // No cycle if list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;         // Tortoise moves one step
            fast = fast.next.next;    // Hare moves two steps

            if(slow == fast){
                return true; // Cycle detected
            }
        }
        return false;    /**If the fast pointer reaches null, there is no cycle */
    }

        public static void main(String[] args) {
        /** : Linked list with a cycle */
        Node head1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(8);
        Node node4 = new Node(1);
        Node node5 = new Node(3);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;   // Creates a cycle

        Solution_LinkedListCycle_Floyds_Tortoise_and_Hare ll = new Solution_LinkedListCycle_Floyds_Tortoise_and_Hare();
        System.out.println("Has cycle (Example 1 - with cycle): "+ll.hasCycle(head1));

        /** : Linked list without a cycle */
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        System.out.println("Has cycle (Example 2 - without cycle): " + ll.hasCycle(head2)); // Expected: false

        // Example 3: Empty linked list
        System.out.println("Has cycle (Example 3 - empty): " + ll.hasCycle(null)); // Expected: false

        // Example 4: Linked list with a single node
        Node head4 = new Node(5);
        System.out.println("Has cycle (Example 4 - single node): " + ll.hasCycle(head4)); // Expected: false
        }
}

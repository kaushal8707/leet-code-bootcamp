public class Solution_Remove_nth_node_from_end_of_list {
    static Node head;

    private void insertAtHead(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    private void printElements(){
        Node temp = head;
        if(temp == null){
            System.out.println("list is empty !!");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }

    private static Node removeNthFromEndOfList(int n){
        Node slow = head;
        Node fast = head;

        for(int i = 1; i <= n; i++){          // Move the fast pointer n steps ahead (suppose  n= 3 to remove 3rd last node)
                                              // This creates a gap of n nodes between fast and slow  so slow at 1 and fast pointer at 4th position
            fast = fast.next;
        }

        if(fast == null){
            return head.next;       // In case if u have a 2 elements and you are trying to delete 2nd from end..so 22, 31.....it will delete 22 and return 31
        }

        if(slow.next == null){
            return null;           // In case if u have 1 node in list and you are trying to delete 1 node from end
        }


        while(fast != null && fast.next != null){  // Move both pointers until the fast pointer reaches the end
            fast = fast.next;            // When fast reaches the end (null), slow will be at the node
            slow = slow.next;            // the one to be removed.
        }

        if(slow!= null && slow.next != null){
            slow.next = slow.next.next;       // 'slow.next' is the node to be removed.
                                              // Bypass the target node by linking slow's next to the target's next.
        }
        return head;
    }

    public static void main(String[] args) {
        int n = 3;
        Solution_Remove_nth_node_from_end_of_list ll=new Solution_Remove_nth_node_from_end_of_list();
        ll.insertAtHead(31);
        ll.insertAtHead(22);
        ll.insertAtHead(23);
        ll.insertAtHead(10);
        ll.insertAtHead(17);
        ll.insertAtHead(12);
        ll.insertAtHead(41);
        ll.printElements();
        System.out.println();
        Node node = removeNthFromEndOfList(2);
        System.out.println(node.data);
        System.out.println();
        ll.printElements();
    }
}

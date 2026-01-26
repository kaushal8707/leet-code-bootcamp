package selftry;

/** Linked List  */
 class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
    ListNode(int data, ListNode next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class Demo{
     public static ListNode removeElementsFromList(ListNode head, int value) {   // 1 2 3 4 6
         ListNode curr=head;
         ListNode dummy=new ListNode(0, head);
         ListNode prev=dummy;
        while(curr!=null && curr.next!=null){
            while (curr.data==value){
                prev.next=curr.next;
                curr=curr.next;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr.data==value && curr.next==null){
           prev.next=null;
        }
        return dummy.next;
     }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(6);
        ListNode listNode = removeElementsFromList(head, 6);
        System.out.println(listNode);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(6);
        head1.next.next.next.next = new ListNode(3);
        head1.next.next.next.next.next = new ListNode(4);
        ListNode listNode1 = removeElementsFromList(head1, 6);
        System.out.println(listNode1);
    }
 }
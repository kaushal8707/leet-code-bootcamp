package SelfTry.RecursiveApproach_LinkedListSwapNodes;

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
    public static ListNode swapList(ListNode head){   // 1 2 3 4 5
        if(head==null || head.next==null){
            return head;
        }
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        ListNode node = swapList(secondNode.next);
        firstNode.next=node;
        secondNode.next=firstNode;
        return secondNode;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode listNode = swapList(head);
        System.out.println(listNode);
    }
}
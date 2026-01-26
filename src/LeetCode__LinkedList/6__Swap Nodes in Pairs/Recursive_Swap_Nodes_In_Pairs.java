
/** Linked List  */
class ListNode1{
    int data;
    ListNode1 next;
    ListNode1(int data){
        this.data=data;
        this.next=null;
    }
    ListNode1(int data, ListNode1 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNode1{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class Demo{
    public static ListNode1 swapList(ListNode1 head){   // 1 2 3 4 5
        if(head==null || head.next==null){
            return head;
        }
        ListNode1 firstNode = head;
        ListNode1 secondNode = head.next;
        ListNode1 node = swapList(secondNode.next);
        firstNode.next=node;
        secondNode.next=firstNode;
        return secondNode;
    }
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);
        ListNode1 listNode = swapList(head);
        System.out.println(listNode);
    }
}
package SelfTry;

/** Linked List  */
class ListNode2{
    int data;
    ListNode2 next;
    ListNode2(int data){
        this.data=data;
        this.next=null;
    }
    ListNode2(int data, ListNode2 next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNode2{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class Demo{
    public static ListNode2 reverseLinkedListII(ListNode2 head, int left, int right){   //  1 2 3 4 5 6 7 8 9 10         left=3, right=8,       1 2 8 7 6 5 4 3 9 10
        ListNode2 previous = new ListNode2(0, head);
        ListNode2 dummy=previous;
        for(int i=0;i<left-1;i++){
            previous=previous.next;
        }
        ListNode2 current=previous.next;
        int i=0;
        while(i<right-left){
            ListNode2 temp = current.next;
            current.next=temp.next;
            temp.next=previous.next;
            previous.next=temp;
            i++;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);
        head.next.next.next.next.next = new ListNode2(6);
        head.next.next.next.next.next.next = new ListNode2(7);
        head.next.next.next.next.next.next.next = new ListNode2(8);
        head.next.next.next.next.next.next.next.next = new ListNode2(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode2(10);
        int lPos=3;
        int rPos=8;
        ListNode2 listNode = reverseLinkedListII(head, lPos, rPos);
        System.out.println(listNode);
    }
}
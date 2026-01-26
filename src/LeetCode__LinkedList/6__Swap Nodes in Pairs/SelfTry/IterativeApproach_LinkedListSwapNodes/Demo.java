package com.dev.work.scenarios.IterativeApproach_LinkedListSwapNodes;

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
    public static ListNode swapNode(ListNode head){   // 1 2 3 4 5
        ListNode previous = new ListNode(1111);
        previous.next=head;
        ListNode dummy = previous;
        ListNode current = head;
        while(current!=null && current.next!=null){
            ListNode first = current;
            ListNode second = current.next;
            previous.next=second;
            first.next=second.next;
            second.next=first;

            previous=current;
            current =first.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode listNode = swapNode(head);
        System.out.println(listNode);
    }
}
class ListNodeX{
    int data;
    ListNodeX next;
    ListNodeX(int data){
        this.data=data;
        this.next=null;
    }
    ListNodeX(int data, ListNodeX next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNodeX{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class SelfTry_DeleteMiddleNode {
    public static ListNodeX deleteMiddleNode(ListNodeX head) {   //  1  3  4  7  1  2  6
        ListNodeX previous = new ListNodeX(0, head);
        ListNodeX fast=head;
        ListNodeX slow=head;
        while(fast!=null && fast.next!=null){
            previous=previous.next;
            slow=slow.next;
            fast=fast.next.next;
        }
        previous.next=slow.next;
        return head;
    }
    public static void main(String[] args) {
        ListNodeX head = new ListNodeX(1);
        head.next = new ListNodeX(3);
        head.next.next = new ListNodeX(4);
        head.next.next.next = new ListNodeX(7);
        head.next.next.next.next = new ListNodeX(1);
        head.next.next.next.next.next = new ListNodeX(2);
        head.next.next.next.next.next.next = new ListNodeX(6);
        ListNodeX listNode = deleteMiddleNode(head);
        System.out.println(listNode);
    }
}

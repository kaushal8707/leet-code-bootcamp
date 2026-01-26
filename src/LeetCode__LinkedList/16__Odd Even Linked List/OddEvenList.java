/** construct NodeJ*/
class NodeH{
    int data;
    NodeH next;
    NodeH(int data){
        this.data=data;
        this.next=null;
    }
    NodeH(int data, NodeH next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "NodeH{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

class OddEvenList{
    public static NodeH oddevenlist(NodeH head) { // 2 1 3 5 6 4 7
        NodeH odd=head;
        NodeH even=head.next;
        NodeH evenHead = even;
        while(even!=null && even.next!=null){
            odd.next= even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        NodeH head = new NodeH(2);
        head.next = new NodeH(1);
        head.next.next = new NodeH(3);
        head.next.next.next = new NodeH(5);
        head.next.next.next.next = new NodeH(6);
        head.next.next.next.next.next = new NodeH(4);
        head.next.next.next.next.next.next = new NodeH(7);
        NodeH oddevenlist = oddevenlist(head);
        System.out.println(oddevenlist);
    }
}
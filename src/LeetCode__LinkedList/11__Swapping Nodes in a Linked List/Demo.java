/** Linked List  */
class ListNodeN{
    int data;
    ListNodeN next;
    ListNodeN(int data){
        this.data=data;
        this.next=null;
    }
    ListNodeN(int data, ListNodeN next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNodeN{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class Demo1{                                                                                                            //       8       6
    public static ListNodeN swappingNodesInaGivenList(ListNodeN head, int pos) {   // 7 9 6 2 7 8 3 0  pos=3
        ListNodeN first=head;
        ListNodeN current=head;
        ListNodeN second=head;
        for(int i=0;i<pos-1;i++){
            first=first.next;
        }
        current=first;
        while(current.next!=null){
            current=current.next;
            second=second.next;
        }
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
        return head;
    }
    public static void main(String[] args) {
        ListNodeN head1 = new ListNodeN(7);
        head1.next = new ListNodeN(9);
        head1.next.next = new ListNodeN(6);
        head1.next.next.next = new ListNodeN(2);
        head1.next.next.next.next = new ListNodeN(7);
        head1.next.next.next.next.next = new ListNodeN(8);
        head1.next.next.next.next.next.next = new ListNodeN(3);
        head1.next.next.next.next.next.next.next = new ListNodeN(0);
        ListNodeN listNode = swappingNodesInaGivenList(head1, 3);
        System.out.println(listNode);
    }
}
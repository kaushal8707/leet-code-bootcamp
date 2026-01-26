/** construct NodeJ*/
class NodeJ{
    int data;
    NodeJ next;
    NodeJ(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "NodeJ{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

class MergeAmongZeros{
    public static NodeJ mergeAmongZeros(NodeJ head) {  // 0 3 1 0 4 5 2 0
        NodeJ NodeJ = new NodeJ(0);
        NodeJ temp=NodeJ;
        NodeJ curr=head;
        int sum=0;
        while(curr!=null){
            if(curr.data!=0){
                sum += curr.data;
            }else if(sum!=0 && curr.data==0){
                NodeJ.next=new NodeJ(sum);
                NodeJ=NodeJ.next;
                sum=0;
            }
            curr=curr.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        NodeJ head = new NodeJ(0);
        head.next = new NodeJ(3);
        head.next.next = new NodeJ(1);
        head.next.next.next = new NodeJ(0);
        head.next.next.next.next = new NodeJ(4);
        head.next.next.next.next.next = new NodeJ(5);
        head.next.next.next.next.next.next = new NodeJ(2);
        head.next.next.next.next.next.next.next = new NodeJ(0);
        NodeJ mergeAmongZerosList = mergeAmongZeros(head);
        System.out.println(mergeAmongZerosList);

        NodeJ head1 = new NodeJ(0);
        head1.next = new NodeJ(3);
        head1.next.next = new NodeJ(11);
        head1.next.next.next = new NodeJ(0);
        head1.next.next.next.next = new NodeJ(4);
        head1.next.next.next.next.next = new NodeJ(12);
        head1.next.next.next.next.next.next = new NodeJ(2);
        head1.next.next.next.next.next.next.next = new NodeJ(0);
        head1.next.next.next.next.next.next.next.next = new NodeJ(18);
        head1.next.next.next.next.next.next.next.next.next = new NodeJ(22);
        head1.next.next.next.next.next.next.next.next.next.next = new NodeJ(0);
        NodeJ mergeAmongZerosList1 = mergeAmongZeros(head1);
        System.out.println(mergeAmongZerosList1);
    }
}
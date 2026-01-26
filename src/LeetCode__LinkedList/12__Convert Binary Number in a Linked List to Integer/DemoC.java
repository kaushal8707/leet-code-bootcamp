/** Linked List  */
 class NodeC{
    int data;
    NodeC next;
    NodeC(int data){
        this.data=data;
        this.next=null;
    }
    NodeC(int data, NodeC next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        return "NodeC{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class DemoC{
     public static int convertBinaryToInteger(NodeC head) {  // 1 0 1
         NodeC curr=head;
         int count=0;
         int result=0;
         while(curr != null){        // remember 2 to power 0 = 1
//             if(count==0){
//                 result += 1*curr.data;
//             }else{
//                 result = 2 * result + (1 * curr.data);
//             }
             result = 2* result + curr.data;
             curr=curr.next;
             count++;
         }
         return result;
     }
    public static void main(String[] args) {
        NodeC head = new NodeC(1);
        head.next = new NodeC(0);
        head.next.next = new NodeC(1);
        int result = convertBinaryToInteger(head);
        System.out.println(result);

        NodeC head1 = new NodeC(0);
        head1.next = new NodeC(1);
        head1.next.next = new NodeC(1);
        int result1 = convertBinaryToInteger(head1);
        System.out.println(result1);

        NodeC head2 = new NodeC(1);
        head2.next = new NodeC(1);
        head2.next.next = new NodeC(1);
        int result2 = convertBinaryToInteger(head2);
        System.out.println(result2);
    }
 }
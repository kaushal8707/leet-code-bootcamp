package self_try;
class Node {
    int data;
    Node ptr;
    Node(int data){
        this.data=data;
        this.ptr=null;
    }
    Node(int data, Node next){
        this.data=data;
        this.ptr=next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", ptr=" + ptr +
                '}';
    }
}
public class LinkList {
    Node head;
    public Node insertAtBeginning(Node n){
        n.ptr = head;
        head = n;
        return head;
    }
    public void deleteFromBeginning() {
        if(head == null){
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
      head=head.ptr;
    }
    public boolean searchInGivenList(int key){
    if(head==null){
        System.out.println("list is empty");
    }
    Node curr=head;
    while(curr!=null){
        if(curr.data==key){
            return true;
        }
        curr=curr.ptr;
    }
    return false;
    }
    public Node insertAtEnd(Node node){
        Node curr=head;
        if(curr==null){
            System.out.println("list is empty!!");
        }
        while(curr.ptr!=null){
            curr=curr.ptr;
        }
        curr.ptr=node;
        return head;
    }
    public void showLinkedListElements(){
        if(head==null){
            System.out.println("list is empty !!");
        }else{
            Node current=head;
            while(current!=null){
                System.out.print(" "+current.data);
                current=current.ptr;
            }
        }
    }
    public Node deleteSpecificNode(Node n) {
        Node current=head;
        if(current==null){
            System.out.println("list is empty!!");
        }
        if(current!=null && current.data==n.data){
            current=current.ptr;
            head=current;
        }

        while(current.ptr!=null ){
            if(current.ptr.data==n.data){
                current.ptr=current.ptr.ptr;
            }
           current=current.ptr;
        }
        return head;
    }
    public Node deleteFromEnd(){
        Node current = head;
        if(current==null){
            System.out.println("list is empty");
        }
        while(current.ptr.ptr!=null){
            current=current.ptr;
        }
        current.ptr=null;
        return head;
    }
    public void insertAtSpecificPosition(Node node, int position){       //88 99 33 22   insert[999] at position 3 so list become 88 99 999 33 22
        Node current = head;
        Node previous=new Node(1111);
        previous.ptr=current;
        node.ptr=current;
        if(position>size()){
            System.out.println("Index Out Of Bound");
            return;
        }
        if(position==1){
            insertAtBeginning(node);
        }
        for(int i=0;i<position-1l;i++){
            previous=current;
            current = current.ptr;
        }
        previous.ptr=node;
        node.ptr=current;
    }
    public void deleteFromSpecificPosition(int position){
        if(position==1)
            deleteFromBeginning();
        if(position>size()){
            System.out.println("Index out of bound");
            return;
        }
        if(position==size())
            deleteFromEnd();
        Node current=head;
        Node previous=new Node(000);
        previous.ptr=current;
        for(int i=0;i<position-1;i++){
            previous=current;
            current=current.ptr;
        }
        previous.ptr=current.ptr;
    }
    public int size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.ptr;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkList linkList=new LinkList();
        linkList.insertAtBeginning(new Node(11));
        linkList.insertAtBeginning(new Node(22));
        linkList.insertAtBeginning(new Node(33));
        linkList.insertAtBeginning(new Node(44));
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("deleteFromBeginning ");
        linkList.deleteFromBeginning();
        System.out.println();
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("searchInGivenList key -  33  ");
        boolean searchInGivenList = linkList.searchInGivenList(33);
        System.out.println("search result  "+searchInGivenList);
        System.out.println("insertAtEnd  77 ");
        linkList.insertAtEnd(new Node(77));
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("deleteSpecificNode  44 ");
        System.out.println();
        linkList.deleteSpecificNode(new Node(44));
        System.out.println("deleteSpecificNode  11 ");
        linkList.deleteSpecificNode(new Node(11));

        System.out.println();
        linkList.showLinkedListElements();
        System.out.println("delete from end ");
        Node deleteFromEnd = linkList.deleteFromEnd();
        System.out.println("deleted - "+deleteFromEnd);
        linkList.showLinkedListElements();
        System.out.println();
        linkList.insertAtBeginning(new Node(99));
        linkList.insertAtBeginning(new Node(88));
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("list size");
        int size = linkList.size();
        System.out.println(size);
        System.out.println("insertAtSpecificPosition - 8");
        linkList.insertAtSpecificPosition(new Node(999), 8);
        System.out.println("insertAtSpecificPosition - 1");
        linkList.insertAtSpecificPosition(new Node(999), 1);
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("insertAtSpecificPosition - 3");
        linkList.insertAtSpecificPosition(new Node(1111), 3);
        System.out.println();
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("deleteFromSpecificPosition - 3");
        linkList.deleteFromSpecificPosition(3);
        linkList.showLinkedListElements();
        System.out.println();
        System.out.println("deleteFromSpecificPosition - 11");
        linkList.deleteFromSpecificPosition(11);
        System.out.println();
        System.out.println("deleteFromSpecificPosition - 1");
        linkList.deleteFromSpecificPosition(1);
        linkList.showLinkedListElements();
        System.out.println();
    }
}

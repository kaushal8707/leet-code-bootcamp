/** construct NodeD*/
class NodeD{
    int data;
    NodeD next;
    NodeD(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "NodeD{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class PalindromeCheckDemo{
    public static boolean isPalindrome(NodeD head) {  // 1  2  3  2  1
        if(head==null || head.next==null){
            return true;
        }
        NodeD middleNodeD = findMiddleNodeD(head);
        NodeD firstHalfHeadNodeD=head;
        NodeD secondHalfHeadNodeD=middleNodeD;
        NodeD reverseListNewHead = reverseSecondHalfLinkedList(secondHalfHeadNodeD);
        Boolean result = checkIsPalindrome(firstHalfHeadNodeD, reverseListNewHead);
        return result;
    }

    private static Boolean checkIsPalindrome(NodeD firstHalfHeadNodeD, NodeD reverseListNewHead) {
        while(firstHalfHeadNodeD!=null){
            if(firstHalfHeadNodeD.data != reverseListNewHead.data){
                return false;
            }
            firstHalfHeadNodeD = firstHalfHeadNodeD.next;
            reverseListNewHead = reverseListNewHead.next;
        }
        return true;
    }

    private static NodeD reverseSecondHalfLinkedList(NodeD secondHalfHeadNodeD) {  // original 3 2 1    //reversed 1 2 3
        NodeD prev = null;
        NodeD curr = secondHalfHeadNodeD;
        NodeD tempNodeD=null;
        while(curr!=null){
            tempNodeD=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNodeD;
        }
        return prev;
    }

    private static NodeD findMiddleNodeD(NodeD head) {
        NodeD slow = head;
        NodeD fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // Example 1: Palindrome list
        NodeD head = new NodeD(1);
        head.next = new NodeD(2);
        head.next.next = new NodeD(3);
        head.next.next.next = new NodeD(2);
        head.next.next.next.next = new NodeD(1);
        String result = isPalindrome(head) ? head + " Is a Palindrome " :
                head + " Is Not a Palindrome";
        System.out.println(result);


        // Example 2: Non-palindrome list
        NodeD head2 = new NodeD(1);
        head2.next = new NodeD(2);
        head2.next.next = new NodeD(3);
        head2.next.next.next = new NodeD(4);
        System.out.println("Is list 2 a palindrome: " + isPalindrome(head2)); // Expected: false

        // Example 3: Single NodeD list
        NodeD head3 = new NodeD(5);
        System.out.println("Is list 3 a palindrome: " + isPalindrome(head3)); // Expected: true

        // Example 4: Empty list
        NodeD head4 = null;
        System.out.println("Is list 4 a palindrome: " + isPalindrome(head4)); // Expected: true
    }
}
public class KReverseLinkedlist {
    public ListNode ReverseLinkedList(ListNode A, int B){

        if(A == null) return null;
        ListNode head = A;
        ListNode currentNode = A.next;
        ListNode prevNode = A;
        ListNode next = null;
        int tempB = B;
        while(tempB-- > 0 && currentNode!= null){
            next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        }


        head.next = ReverseLinkedList(currentNode, B);

        return prevNode;
    }
}

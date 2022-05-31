public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode A, int B, int C){
        if(A == null || B == C) return A;

        ListNode nodeBeforeStart = null;
        ListNode startNode = A;

        for(int i=1;i<B;i++){
            nodeBeforeStart = startNode;
            startNode = startNode.next;
        }

        ListNode currentNode = startNode.next;
        ListNode prevNode = startNode;
        ListNode nextNode = null;

        while(C-- > B || currentNode!= null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        startNode.next = currentNode;
        if(nodeBeforeStart!= null){
            nodeBeforeStart.next = prevNode;
            return A;
        }

        return prevNode;
    }
    
}

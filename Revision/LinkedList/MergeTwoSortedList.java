public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
        ListNode head = new ListNode(0);
        ListNode currentA = A;
        ListNode currentB = B;
        
        ListNode currentNode = head;
        while(currentA!= null && currentB!= null){
            if(currentA.val < currentB.val){
                currentNode.next = currentA;
                
                currentA = currentA.next;
            }
            else{
                currentNode.next = currentB;
                currentB = currentB.next;
            }
            currentNode = currentNode.next;
        }

        if(currentA!= null){
            currentNode.next = currentA;
        }
        else{
            currentNode.next = currentB;
        }

        return head.next;
    }
}

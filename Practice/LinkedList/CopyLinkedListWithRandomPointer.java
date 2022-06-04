public class CopyLinkedListWithRandomPointer {
    ListNode cloneList(ListNode A) {
        if(A==null || A.next == null) return A;

        ListNode curr = A;
        ListNode next = null;

        while(curr!= null){
            next = curr.next;
            ListNode newNode = new ListNode(curr.val);
            curr.next = newNode;
            newNode.next = next;
            curr = next;
        }

        curr = A;

        while(curr!= null){
            curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        
        curr = A;
        ListNode resultHead = curr.next;
        ListNode tempResult = resultHead;
        next = resultHead.next;
        curr = next;
        while(curr!= null){
            next = curr.next;
            tempResult.next = next;
            tempResult = tempResult.next;
            curr = tempResult.next;
        }

        return resultHead;
    
}
}

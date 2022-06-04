class ListNode{
    int val;
    ListNode next;
    ListNode random;

    ListNode(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class DeleteMiddleNodeOfLinkedList{
    
    public ListNode Solve(ListNode A){
        ListNode slowPointer = A;
        ListNode fastPointer = A;
        ListNode prevNode = null;

        while(fastPointer.next!= null && fastPointer.next.next != null){
            prevNode = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        if(fastPointer == slowPointer){
            if(A.next == null){
                A = A.next;
            }
            else{
                A.next = null;
            }
        }
        else if(fastPointer.next != null){
            slowPointer.next = slowPointer.next.next;
        }
        else{
            prevNode.next = prevNode.next.next;
        }

        return A;


    }
}
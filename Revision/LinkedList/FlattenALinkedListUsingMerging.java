public class FlattenALinkedListUsingMerging {
    public ListNode flatten(ListNode A){
        if(A == null || A.next == null) return A;

        //Using root and root.next element
        ListNode one = A;
        ListNode two = flatten(A.next);


        ///Using mid
        // ListNode mid = GetMid(A);
        // ListNode one = A;
        // ListNode two = mid.next;
        // mid.next = null;

        return Merge(one,two);
    }

    public ListNode Merge(ListNode A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;

        ListNode head = null;
        if(A.val <= B.val){
            head = A;
            head.next = Merge(A.next, B);
        }
        else{
            head = B;
            head.next = Merge(A, B.next);
        }

        return head;
    }

    public ListNode GetMid(ListNode A){
        ListNode slowPointer = A;
        ListNode fastPointer = A;

        while(fastPointer.next!= null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}

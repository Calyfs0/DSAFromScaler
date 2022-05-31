public class RemoveLoopFromLinkedlist {
    public ListNode solve(ListNode A) {
        if(A == null) return A;
        ListNode fastPointer = A;
        ListNode slowPointer = A;
        while(fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer){
                ListNode prev = null;
                slowPointer = A;
                while(slowPointer != fastPointer){
                    prev = fastPointer;
                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
                prev.next = null;
                return A;
            }
        }

        return null;
    }
}

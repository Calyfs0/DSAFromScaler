public class ListCycle {
    public ListNode detectCycle(ListNode a) {
        if(a == null) return a;
        ListNode fastPointer = a;
        ListNode slowPointer = a;
        while(fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer){
                slowPointer = a;
                while(slowPointer != fastPointer){
                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
                return slowPointer;
            }
        }

        return null;
	}   
    
}

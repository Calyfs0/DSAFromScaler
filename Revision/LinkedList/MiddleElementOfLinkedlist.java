public class MiddleElementOfLinkedlist {

    public int solve(ListNode A) {
        ListNode slowPointer = A;
        ListNode fastPointer = A;

        while(fastPointer!= null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer.val;
    }
    
}

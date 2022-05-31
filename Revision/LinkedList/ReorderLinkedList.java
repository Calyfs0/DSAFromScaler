public class ReorderLinkedList {
    public ListNode reorderList(ListNode A) {
        if(A == null) return A;

        ListNode fastPointer = A;
        ListNode slowPointer = A;

        while(fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode headOne = A;
        ListNode headTwo = slowPointer.next;
        slowPointer.next = null;

        headTwo = reverseList(headTwo);
        ListNode nextNode = null;
        while(headOne!= null && headTwo!= null){
            nextNode = headTwo.next;
            headTwo.next = headOne.next;
            headOne.next = headTwo;
            headOne = headTwo.next;
            headTwo = nextNode;
        }

        return A;
    }

    public ListNode reverseList(ListNode A){
        if(A == null || A.next == null) return A;

        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

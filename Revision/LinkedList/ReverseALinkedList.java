public class ReverseALinkedList {
    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = A;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

public class SortLinkedList {

    public ListNode MergeSort(ListNode A){
        if(A == null || A.next == null) return A;

        ListNode slowPointer = A;
        ListNode fastPointer = A;

        while(fastPointer.next!= null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode leftHead = A;
        ListNode rightHead = slowPointer.next;

        slowPointer.next = null;

        ListNode leftLinkedList = MergeSort(leftHead);
        ListNode rightLinkedList = MergeSort(rightHead);

        return sortMergeList(leftLinkedList, rightLinkedList);
    }

    public ListNode sortMergeList(ListNode A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;

        ListNode head = null;

        if(A.val <= B.val){
            head = A;
            head.next = sortMergeList(A.next, B);
        }
        else{
            head = B;
            head.next = sortMergeList(A, B.next);
        }

        return head;
    }
    
}

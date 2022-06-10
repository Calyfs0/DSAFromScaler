import java.util.ArrayList;

public class MergeKSortedListsWithoutPriorityQueue {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        if(a.size() == 0) return null;
        if(a.size() == 1) return a.get(0);
        return MergeKSortedLists(a,0,a.size() -1);
    }

    public ListNode MergeKSortedLists(ArrayList<ListNode> A, int index, int maxIndex){
        if(index == maxIndex) return A.get(index);

        ListNode head1 = A.get(index);
        ListNode head2 = MergeKSortedLists(A, index+1, maxIndex);

        return MergeTwoLists(head1,head2);


    }

    public ListNode MergeTwoLists(ListNode A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;

        ListNode head = null;

        if(A.val <= B.val){
            head = A;
            head.next = MergeTwoLists(A.next, B);
        }
        else{
            head = B;
            head.next = MergeTwoLists(A, B.next);
        }

        return head;
    }
}

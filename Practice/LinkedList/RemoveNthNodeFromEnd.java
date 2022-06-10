//Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;
    public ListNode random;
    ListNode(int x) { val = x; next = null;random = null; }
}
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode secondPointer = A;
        for(int i=0;i<B;i++){
            if(secondPointer.next!= null){
                secondPointer = secondPointer.next;
            }
            else{
                A = A.next;
                return A;
            } 

        }

        ListNode firstPointer = A;

        while(secondPointer.next!= null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        firstPointer.next = firstPointer.next.next;

        return A;
    }
}

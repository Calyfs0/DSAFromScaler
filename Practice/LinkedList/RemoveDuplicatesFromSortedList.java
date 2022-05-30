
  //Definition for singly-linked list.
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode currentNode = A;
        
        while(currentNode.next != null){
            while(currentNode.val == currentNode.next.val && currentNode.next!= null && currentNode.next.next!= null)
            {
                currentNode.next = currentNode.next.next;
            }

            currentNode = currentNode.next;
        }
        
        return A;
    }
}


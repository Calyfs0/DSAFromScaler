import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MergeKSortedLinkedList {

    public ListNode mergeKLists(ArrayList<ListNode> a) {
        if (a.size() == 0)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new customComparator());

        for (int i = 0; i < a.size(); i++) {
            pq.add(a.get(i));
        }

        ListNode resultHead = new ListNode(-1);
        ListNode curr = resultHead;

        while (!pq.isEmpty()) {
            ListNode currentNode = pq.poll();
            if (currentNode.next != null) {
                pq.add(currentNode.next);
            }
            curr.next = currentNode;
            curr = currentNode;
        }

        return resultHead.next;
    }

    class customComparator implements Comparator<ListNode> {
        public int compare(ListNode A, ListNode B) {
            return A.val - B.val;
        }
    }
}
import java.util.Comparator;
import java.util.PriorityQueue;

class LinkedListNode {
    int val;
    LinkedListNode right, down;
    LinkedListNode(int x) {
        val = x;
        right = down = null;
    }
}

public class FlattenALinkedList {

    public static void main(String[] args) {
        LinkedListNode root = new LinkedListNode(3);
        
        LinkedListNode node1 = new LinkedListNode(4);
        root.right = node1;
        LinkedListNode root2 = new LinkedListNode(20);
        node1.right = root2;
        LinkedListNode root3 = new LinkedListNode(20);
        root2.right = root3;
        LinkedListNode root4 = new LinkedListNode(30);
        root3.right = root4;


        LinkedListNode root5 = new LinkedListNode(7);
        root.down = root5;
        LinkedListNode root6 = new LinkedListNode(7);
        root5.down = root6;
        LinkedListNode root7 = new LinkedListNode(8);
        root6.down = root7;

        LinkedListNode root8 = new LinkedListNode(11);
        node1.down = root8;


        LinkedListNode root9 = new LinkedListNode(22);
        root2.down = root9;
        
        LinkedListNode root10 = new LinkedListNode(20);
        root3.down = root10;
        LinkedListNode root11 = new LinkedListNode(28);
        root10.down = root11;
        LinkedListNode root12 = new LinkedListNode(39);
        root11.down = root12;

        LinkedListNode root13 = new LinkedListNode(31);
        root4.down = root13;
        LinkedListNode root14 = new LinkedListNode(39);
        root13.down = root14;

        FlattenALinkedList flattenALinkedList = new FlattenALinkedList();
        LinkedListNode result = flattenALinkedList.flatten(root);
        {
            while(result!= null){
                System.out.println(result.val);
                result = result.right;
            }
        }

        
    }
    LinkedListNode flatten(LinkedListNode root) {
        if(root == null) return root;

        PriorityQueue<LinkedListNode> pq = new PriorityQueue<LinkedListNode>(new CustomComparator());
        pq.add(root);

        LinkedListNode dummyNode = new LinkedListNode(-1);
        LinkedListNode tempDummyNode = dummyNode;
        while(!pq.isEmpty()){
            LinkedListNode currentNode = pq.poll();
            if(currentNode.down!= null) pq.add(currentNode.down);
            if(currentNode.right!= null) pq.add(currentNode.right);
            tempDummyNode.down = currentNode;
            tempDummyNode = tempDummyNode.down;

            
        }

        return dummyNode.down;
    }
}

class CustomComparator implements Comparator<LinkedListNode>{

    @Override
    public int compare(LinkedListNode arg0, LinkedListNode arg1) {
        return arg0.val - arg1.val;
    }

}


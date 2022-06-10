import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> LevelNodesQueue = new LinkedList<TreeNode>();
        LevelNodesQueue.offer(A);
        ArrayList<ArrayList<Integer>> finalOutput = new ArrayList<>();

        while (!LevelNodesQueue.isEmpty()) {
            int length = LevelNodesQueue.size();
            ArrayList<Integer> currentOutput = new ArrayList<>();
            while (length > 0) {

                TreeNode currentNode = LevelNodesQueue.poll();
                currentOutput.add(currentNode.val);
                if (currentNode.left != null) {
                    LevelNodesQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    LevelNodesQueue.add(currentNode.right);
                }
                length--;
            }

            finalOutput.add(currentOutput);
        }

        return finalOutput;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }
}
/**
 * Definition for binary tree
 * class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) {this.val = x; this.left = this.right = null;}
 * }
 */
class Solution {
    public List<List<int>> zigzagLevelOrder(TreeNode A) {
        bool isReverseOrder = false;
            Queue<TreeNode> queue = new Queue<TreeNode>();
            List<List<int>> finalOutput = new List<List<int>>();

            queue.Enqueue(A);
            while (queue.Count > 0)
            {
                List<int> currentValues = new List<int>();
                int length = queue.Count;
                for (int i = 0; i < length; i++) { 
                    TreeNode currentValue = queue.Dequeue();
                    currentValues.Add(currentValue.val);
                    if (currentValue.left != null)
                    {
                        queue.Enqueue(currentValue.left);
                    }

                    if (currentValue.right != null)
                    {
                        queue.Enqueue(currentValue.right);
                    }
                }
                List<int> output = new List<int>();
                if (isReverseOrder)
                {
                    for (int i = currentValues.Count -1 ; i >= 0; i--)
                    {
                        output.Add(currentValues[i]);
                    }
                    isReverseOrder = false;
                }
                else{
                    for (int i = 0; i < currentValues.Count; i++)
                    {
                        output.Add(currentValues[i]);
                    }
                    isReverseOrder = true;
                }
                
                
                finalOutput.Add(output);
            }

            return finalOutput;
    }
}

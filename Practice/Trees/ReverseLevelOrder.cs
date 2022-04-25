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
    public List<int> solve(TreeNode A) {
        Queue<TreeNode> queue = new Queue<TreeNode>();
        queue.Enqueue(A);
        List<int> output = new List<int>();
        
        while(queue.Count > 0){
            int length = queue.Count;
            while(length > 0){
                
                TreeNode currentValue = queue.Dequeue();
                output.Add(currentValue.val);
                if(currentValue.right != null){
                    queue.Enqueue(currentValue.right);
                }
                if(currentValue.left != null){
                    queue.Enqueue(currentValue.left);
                }  
                length--;     
            }
            

             
        }
        
        List<int> finalOutput = new List<int>();
        for(int i=output.Count-1;i>=0;i--){
            finalOutput.Add(output[i]);
        }
        return finalOutput;
}
}

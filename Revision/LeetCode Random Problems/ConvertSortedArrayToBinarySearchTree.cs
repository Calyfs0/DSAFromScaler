/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode SortedArrayToBST(int[] nums) {
        return ConstructTree(nums,0,nums.Length-1);
    }
    
    public TreeNode ConstructTree(int[] nums, int start, int end){
        if (start < 0 || end > nums.Length - 1) return null;
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = ConstructTree(nums,start,mid-1);
        root.right = ConstructTree(nums,mid+1,end);
        return root;
    }
}
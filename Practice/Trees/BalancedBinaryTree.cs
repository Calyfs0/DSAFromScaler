public int isBalanced(TreeNode A) {
        int ans = 1;
        CheckBBT(A,ref ans);
        return ans;  
    }

    public int CheckBBT(TreeNode node,ref int ans){
        if(node == null){
            return -1;
        }

        int leftHeight = CheckBBT(node.left,ref ans);
        int rightHeight = CheckBBT(node.right,ref ans);

        if(Math.Abs(leftHeight - rightHeight) > 1) {
            ans = 0;
        }

        return Math.Max(leftHeight,rightHeight) + 1;
    }
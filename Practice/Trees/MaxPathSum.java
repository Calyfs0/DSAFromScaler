public class MaxPathSum {
    static int ans;

    public static void main(String[] args) {
        ans = Integer.MIN_VALUE;
        MaxPathSum mp = new MaxPathSum();
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        mp.FindMaxPathSum(A);
        System.out.println(ans);
    }

    public int FindMaxPathSum(TreeNode A) {

        if (A == null)
            return 0;

        int left = Math.max(0, FindMaxPathSum(A.left));
        int right = Math.max(0, FindMaxPathSum(A.right));
        ans = Math.max(ans, left + right + A.val);

        return A.val + Math.max(left, right);
    }
}
function PathSum(root, sum) {
  if (root == null) return false;
  sum -= root.data;

  if (!root.left && !root.right) return sum === root.val;

  return PathSum(root.left, sum) || PathSum(root.right, sum);
}

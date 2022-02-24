let diameter = 0;

function DiameterOfATree(root) {
  if (root == null) return -1;

  let leftHeight = DiameterOfATree(root.left);
  let rightHeight = DiameterOfATree(root.right);

  diameter = Math.max(diameter, leftHeight + rightHeight + 2);

  return Math.max(leftHeight, rightHeight) + 1;
}
DiameterOfATree(A);
console.log(diameter);

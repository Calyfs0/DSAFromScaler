function BSTNodeInARange(A, B, C) {
  let count = 0;
  NodesInRange(A, B, C);
  return count;
  function NodesInRange(A) {
    if (!A) return;

    if (A.data < B) NodesInRange(A.right);
    else if (A.data > C) NodesInRange(A.left);
    else {
      count++;
      NodesInRange(A.left);
      NodesInRange(A.right);
    }
  }
}

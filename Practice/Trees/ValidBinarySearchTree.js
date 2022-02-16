function ValidBinarySearchTree(A) {
  return IsValid(A, Number.MIN_SAFE_INTEGER, Number.MAX_SAFE_INTEGER);
}

function IsValid(A, min, max) {
  if (A == null) return true;

  if (A.data < min || A.data > max) return false;

  return IsValid(A.left, min, A.data) && IsValid(A.right, A.data, max);
}

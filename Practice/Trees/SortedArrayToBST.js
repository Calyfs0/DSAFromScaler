const A = [1, 2, 3, 5, 10];

function SortedArrayToBST(A, left, right) {
  if (A == null || left > right) return null;

  let mid = Math.floor((left + right) / 2);
  let root = new Node(A[mid]);
  root.left = SortedArrayToBST(A, left, mid - 1);
  root.right = SortedArrayToBST(A, mid + 1, right);

  return root;
}

class Node {
  constructor(num) {
    this.data = num;
    this.left = null;
    this.right = null;
  }
}

console.log(SortedArrayToBST(A, 0, A.length - 1));

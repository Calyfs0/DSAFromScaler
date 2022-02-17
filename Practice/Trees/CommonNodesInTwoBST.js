function CommonNodesInTwoBST() {
  inorderA = [];
  inorderB = [];
  let mod = 1000000007;
  let sum = 0;
  inorderA = InorderTraversal(A, inorderA);
  inorderB = InorderTraversal(B, inorderB);

  let hs = new Set(inorderA);

  for (let i = 0; i < inorderB.length; i++) {
    if (hs.has(inorderB[i])) {
      sum = ((sum % mod) + (inorderB[i] % mod)) % mod;
    }
  }

  return sum;
}

function InorderTraversal(A, output) {
  if (A == null) return;

  InorderTraversal(A.left, output);
  output.push(A.data);
  InorderTraversal(A.right, output);

  return output;
}

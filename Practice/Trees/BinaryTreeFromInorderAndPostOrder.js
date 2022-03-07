function TreeNode(data) {
  this.data = data;
  this.left = null;
  this.right = null;
}

function BinaryTreeFromInorderAndPostOrder(A, B) {
  return buildTree(A, 0, A.length - 1, B, 0, B.length - 1);

  function buildTree(
    inorderTree,
    iAStart,
    iAEnd,
    postOrderTree,
    pOStart,
    pOEnd
  ) {
    if (iAStart > iAEnd) return null;

    let rootValue = postOrderTree[pOEnd];
    let rootIndex = -1;
    for (let i = iAStart; i <= iAEnd; i++) {
      if (inorderTree[i] == rootValue) {
        rootIndex = i;
        break;
      }
    }

    let root = new TreeNode(rootValue);
    let leftArraySize = rootIndex - iAStart;
    root.left = buildTree(
      inorderTree,
      iAStart,
      rootIndex - 1,
      postOrderTree,
      pOStart,
      pOStart + leftArraySize - 1
    );
    root.right = buildTree(
      inorderTree,
      rootIndex + 1,
      iAEnd,
      postOrderTree,
      pOStart + leftArraySize,
      pOEnd - 1
    );
    return root;
  }
}

A = [6, 1, 3, 2];
B = [6, 3, 2, 1];

console.log(BinaryTreeFromInorderAndPostOrder(A, B));

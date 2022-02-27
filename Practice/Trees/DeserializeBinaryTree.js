function DeserializeBinaryTree(A) {
  let arr = [];

  for (let i = 0; i < A.length; i++) {
    if (A[i] != -1) {
      arr.push(new TreeNode(A[i]));
    } else arr.push(-1);
  }

  let j = 1;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == -1) continue;
    if (arr[j] != -1) {
      arr[i].left = arr[j++];
    } else j++;

    if (arr[j] != -1) {
      arr[i].right = arr[j++];
    } else j++;
  }

  return arr[0];
}

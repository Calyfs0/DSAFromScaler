function NextPointerBinaryTree(A) {
  let curr = A;

  while (curr != null) {
    let temp = curr;

    while (temp != null) {
      if (temp.left) temp.left.next = temp.right;
      if (temp.right && temp.next) temp.right = temp.next.left;
      temp = temp.next;
    }

    curr = curr.left;
  }

  return A;
}

function SerializeBinaryTree(A) {
  let output = [];
  let queue = [];
  queue.push(A);

  while (queue.length > 0) {
    let val = queue.shift();
    output.push(val == -1 ? -1 : val.data);
    if (val != -1) {
      queue.push(!val.left ? -1 : val.left);
      queue.push(!val.right ? -1 : val.right);
    }
  }

  return output;
}

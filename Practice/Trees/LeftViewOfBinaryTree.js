/**
 * We construct a level order tree and print first value from each level
 * @param {Root of binary Tree} A
 * @returns leftView
 */

function LeftViewBinaryTree(A) {
  let output = [];
  if (!A.left && !A.right) {
    let curr_output = [A.data];
    output.push(curr_output);
    return output;
  }
  let queue = [A];

  while (queue.length) {
    let len = queue.length;
    output.push(queue.map((node) => node.data));

    while (len--) {
      let node = queue.shift();
      if (node.left) queue.push(node.left);
      if (node.right) queue.push(node.right);
    }
  }
  let leftview = [];
  for (const x of output) {
    leftview.push(x[0]);
  }

  return leftview;
}

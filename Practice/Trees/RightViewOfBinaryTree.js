/**
 * We construct a level order tree and print last value from each level or we can construct from right to left and print the first value from each level
 * @param {Root of binary Tree} A
 * @returns leftView
 */

function RightViewBinaryTree(A) {
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
      if (node.right) queue.push(node.right);
      if (node.left) queue.push(node.left);
    }
  }
  let rightview = [];
  for (const x of output) {
    rightview.push(x[0]);
  }

  return rightview;
}

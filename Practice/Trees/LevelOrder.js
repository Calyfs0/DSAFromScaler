// Definition for a  binary tree node
//    function TreeNode(data){
//      this.data = data
//      this.left = null
//      this.right = null
//    }
A = function LevelOrder(A) {
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

  return output;
};

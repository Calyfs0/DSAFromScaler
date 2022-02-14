// Definition for a  binary tree node
//    function TreeNode(data){
//      this.data = data
//      this.left = null
//      this.right = null
//    }
function VerticalOrderTraversal(A) {
  if (!A) return [];
  let output = [];
  let queue = [[A, 0]];
  let hm = {};
  hm[0] = [A.data];
  let min = 0;
  let max = 0;

  while (queue.length) {
    let front = queue.shift();
    let node = front[0];
    let level = front[1];
    min = Math.min(min, level);
    max = Math.max(max, level);

    if (node.left) {
      queue.push([node.left, level - 1]);
      hm[level - 1].push(node.left.data);
    }
    if (node.right) {
      queue.push([node.right, level + 1]);
      hm[level + 1].push(node.right.data);
    }
  }

  for (let i = min; i <= max; i++) {
    let curr_arr = hm[i];
    output.push(curr_arr);
  }
  return output;
}

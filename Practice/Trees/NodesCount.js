// Definition for a  binary tree node
//    function TreeNode(data){
//      this.data = data
//      this.left = null
//      this.right = null
//    }

module.exports = {
  //param A : root node of tree
  //return an integer
  solve: function (A) {
    return NodesCount(A);
  },
};

function NodesCount(A) {
  if (A == null) return 0;

  let lc = NodesCount(A.left);
  let rc = NodesCount(A.right);

  return lc + rc + 1;
}

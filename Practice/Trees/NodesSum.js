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
    return NodeSum(A);
  },
};

function NodeSum(A) {
  if (A == null) return 0;

  let ls = NodeSum(A.left);
  let rs = NodeSum(A.right);

  return ls + rs + A.data;
}

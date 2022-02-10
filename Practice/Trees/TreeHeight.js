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
    return TreeHeight(A);
  },
};

function TreeHeight(A) {
  if (A == null) return 0;

  return Math.max(TreeHeight(A.left), TreeHeight(A.right)) + 1;
}

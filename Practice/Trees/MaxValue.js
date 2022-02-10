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
    return MaxValue(A);
  },
};

function MaxValue(A) {
  if (A == null) return -1;

  let max = Math.max(MaxValue(A.left), A.data);
  max = Math.max(max, MaxValue(A.right));

  return max;
}

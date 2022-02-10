let output = [];
module.exports = {
  //param A : root node of tree
  //return a array of integers
  postorderTraversal: function (A) {
    output = [];
    return postorderTraversal(A);
  },
};

function postorderTraversal(A) {
  if (A == null) return;

  postorderTraversal(A.left);
  postorderTraversal(A.right);
  output.push(A.data);

  return output;
}

// Definition for a  binary tree node
//    function TreeNode(data){
//      this.data = data
//      this.left = null
//      this.right = null
//    }

module.exports = {
  //param A : root node of tree
  //param B : array of integers
  //return a array of array of integers
  solve: function (A, B) {
    let finaloutput = [];
    B.forEach((x) => {
      let output = [];
      output.push(FindFloor(A, x));
      output.push(FindCeil(A, x));
      finaloutput.push(output);
    }, finaloutput);

    return finaloutput;
  },
};

function FindFloor(A, x) {
  let temp = A;
  let floor = -1;

  while (temp) {
    if (temp.data == x) return x;
    if (temp.data < x) {
      floor = temp.data;
      temp = temp.right;
    } else if (temp.data > x) {
      temp = temp.left;
    }
  }

  return floor;
}

function FindCeil(A, x) {
  let temp = A;
  let ceil = -1;

  while (temp) {
    if (temp.data == x) return x;
    if (x < temp.data) {
      ceil = temp.data;
      temp = temp.left;
    } else if (x > temp.data) {
      temp = temp.right;
    }
  }

  return ceil;
}

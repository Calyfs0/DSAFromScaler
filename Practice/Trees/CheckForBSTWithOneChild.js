const A = [12, 1, 9, 6, 2];
function CheckForBSTWithOneChild(A) {
  if (A <= 1) return "YES";

  //decide whether the node is going left or right

  //Left Node
  if (A[0] > A[1]) {
    max_value = A[0];
    min_value = A[1];
    //Checking for left Node
    for (let i = 2; i < A.length; i++) {
      curr_node = A[i - 1];
      curr_value = A[i];

      if (curr_value > max_value || curr_value > min_value) return "NO";
      if (curr_value > curr_node) {
        min_value = curr_node;
      } else {
        max_value = curr_node;
      }
    }
  }
  //Right Node
  else {
    max_value = A[0];
    //Checking for right node
    for (let i = 2; i < A.length; i++) {
      curr_node = A[i - 1];
      curr_value = A[i];

      if (curr_value < max_value) return "NO";
      if (curr_value > curr_node) max_value = curr_node;
    }
  }

  return "YES";
}

console.log(CheckForBSTWithOneChild(A));

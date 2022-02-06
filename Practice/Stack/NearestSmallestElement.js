function NearestSmallestElement(A) {
  let stack = [];
  let output = [];
  for (let i = 0; i < A.length; i++) {
    let top = findTop(stack);
    if (top != null) {
      while (top >= A[i]) {
        stack.pop();
        top = findTop(stack);
      }
      output.push(top == null ? -1 : top);
    } else {
      output.push(-1);
    }
    stack.push(A[i]);
  }
  return output;
}

function findTop(stack) {
  if (stack.length == 0) return null;
  return stack[stack.length - 1];
}
A = [4, 5, 2, 10, 8];

console.log(NearestSmallestElement(A));

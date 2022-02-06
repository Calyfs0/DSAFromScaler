function EvaluateExpression(A) {
  if (A.length == 1) {
    return A[0];
  }

  if (A.length == 2) {
    if (A[1] == `-`) {
      return -1 * A[0];
    }
    return A[0];
  }

  let stack = [];
  let ans = null;
  for (let i = 0; i < A.length; i++) {
    if (`+-*/`.includes(A[i])) {
      let val2 = stack.pop();
      let val1 = stack.pop();
      let operator = A[i];
      switch (operator) {
        case `+`:
          ans = Number(val1) + Number(val2);
          break;
        case `-`:
          ans = Number(val1) - Number(val2);
          break;
        case `*`:
          ans = Number(val1) * Number(val2);
          break;
        case `/`:
          ans = Math.floor(Number(val1) / Number(val2));
          break;
      }
      stack.push(ans);
    } else {
      stack.push(A[i]);
    }
  }

  return ans;
}

A = ["4", "13", "5", "/", "+"];
console.log(EvaluateExpression(A));

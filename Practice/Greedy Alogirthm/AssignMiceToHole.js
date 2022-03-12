function AssignMiceToHole(A, B) {
  let ans = Number.MIN_SAFE_INTEGER;
  A.sort((a, b) => a - b);
  B.sort((a, b) => a - b);

  for (let i = 0; i < A.length; i++) {
    ans = Math.max(ans, Math.abs(A[i] - B[i]));
  }
  return ans;
}

A = [-4, 2, 3];
B = [0, -2, 4];

console.log(AssignMiceToHole(A, B));

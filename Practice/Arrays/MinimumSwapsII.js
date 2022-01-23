function MinimumSwapsII(A) {
  let count = 0;
  for (let i = 0; i < A.length; i++) {
    while (A[i] != i) {
      count++;
      let temp = A[i];
      A[i] = A[A[i]];
      A[temp] = temp;
    }
  }
  console.log(A);
  return count;
}

let A = [2, 0, 1, 3];
console.log(MinimumSwapsII(A));

function Permutations(A) {
  let finalOutput = [];
  let output = [];
  findSixLets(A, 0, A.length);
  return finalOutput;
  function findSixLets(A, i, n) {
    if (i == n) {
      finalOutput.push(output.map((val) => val));
      return;
    }

    for (let k = i; k < n; k++) {
      swap(A, k, i);
      output.push(A[i]);
      findSixLets(A, i + 1, n);
      swap(A, k, i);
      output.pop();
    }
  }

  function swap(A, i, j) {
    let temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
}

A = [1, 2, 3];

console.log(Permutations(A));

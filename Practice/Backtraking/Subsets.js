function Subsets(A) {
  if (A.length == 0) return [[]];
  let finalOutput = [];
  let subset = [];
  GenerateSubsets(0, A.length, subset);
  finalOutput.sort(function (a, b) {
    let i = 0;
    while (i < a.length && i < b.length) {
      if (a[i] != b[i]) {
        return a[i] - b[i];
      }
      i++;
    }

    return a.length - b.length;
  });
  return finalOutput;
  function GenerateSubsets(i, n, subset) {
    if (i == n) {
      let output = [];
      for (let i = 0; i < subset.length; i++) {
        output.push(subset[i]);
      }
      output.sort((a, b) => a - b);
      finalOutput.push(output);
      return;
    }

    subset.push(A[i]);
    GenerateSubsets(i + 1, n, subset);
    subset.pop();
    GenerateSubsets(i + 1, n, subset);
    return finalOutput;
  }
}

A = [15, 20, 12, 19, 4];

console.log(Subsets(A));

function CombinationSum(A, B) {
  let current_sum = 0;
  let finalOutput = [];
  let output = [];

  A.sort(function (a, b) {
    return a - b;
  });

  let sortedArray = [A[0]];

  for (let i = 0; i < A.length; i++) {
    if (i != 0 && A[i] != A[i - 1]) {
      sortedArray.push(A[i]);
    }
  }
  findCombinations(sortedArray, 0);

  return finalOutput;
  function findCombinations(A, index) {
    if (current_sum > B) {
      return;
    }

    if (current_sum == B) {
      finalOutput.push(output.map((val) => val).sort((a, b) => a - b));
      return;
    }
    for (let i = index; i < sortedArray.length; i++) {
      output.push(sortedArray[i]);
      current_sum += sortedArray[i];
      findCombinations(sortedArray, i);
      current_sum -= sortedArray[i];
      output.pop();
    }
  }
}

A = [8, 10, 6, 11, 1, 16, 8];
B = 28;

console.log(CombinationSum(A, B));

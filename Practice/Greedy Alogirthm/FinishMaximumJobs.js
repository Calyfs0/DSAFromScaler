function FinishMaximumJobs(A, B) {
  let output = 1;
  let newArray = [];
  for (let i = 0; i < A.length; i++) {
    let curr_input = [A[i], B[i]];
    newArray.push(curr_input);
  }
  newArray.sort(function (a, b) {
    return a[1] - b[1];
  });
  let endTime = newArray[0][1];
  for (let i = 1; i < newArray.length; i++) {
    if (newArray[i][0] >= endTime) {
      output++;
      endTime = newArray[i][1];
    }
  }

  console.log(output);
}

A = [4, 4, 8, 15, 6];
B = [9, 5, 15, 16, 7];

FinishMaximumJobs(A, B);

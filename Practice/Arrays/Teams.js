function Teams(A) {
  let zeroCount = 0;
  let oneCount = 0;
  let count = 0;
  for (let i = 0; i < A.length; i++) {
    if (A[i] == "0") {
      zeroCount++;
    } else if (A[i] == "1") {
      oneCount++;
    }
    if (zeroCount == oneCount && zeroCount != 0 && oneCount != 0) {
      count++;
      zeroCount = 0;
      oneCount = 0;
    }
  }

  return count;
}

A = "00100000100101111111";

console.log(Teams(A));

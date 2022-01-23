function PeriodOfAString(A) {
  let ans = 1;
  for (let i = 1; i < A.length; i++) {
    if (A[i] == A[0]) ans = 1;
    else ans++;
  }
  return ans;
}

A = "abcaabcaab";
console.log(PeriodOfAString(A));

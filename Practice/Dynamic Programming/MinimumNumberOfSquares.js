function MinimumNumberOfSquares(A) {
  let arr = [];
  for (let i = 0; i <= A; i++) {
    arr.push(-1);
  }
  return findValue(A);
  function findValue(A) {
    if (A == 0) return 0;
    if (arr[A] != -1) return arr[A];

    arr[A] = 1;
    let min = Number.MAX_SAFE_INTEGER;

    for (let i = 1; i * i <= A; i++) {
      min = Math.min(min, findValue(A - i * i));
    }
    arr[A] += min;
    return arr[A];
  }
}
A = 6;
console.log(MinimumNumberOfSquares(A));

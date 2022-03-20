function FibonacciNumber(A) {
  let arr = [];

  for (let i = 0; i <= A; i++) {
    arr.push(-1);
  }
  return findAthNum(A);
  function findAthNum(A) {
    if (A == 1) return 1;
    if (A == 0) return 0;

    if (arr[A] != -1) return arr[A];

    arr[A] = findAthNum(A - 1) + findAthNum(A - 2);
    return arr[A];
  }
}

A = 4;

console.log(FibonacciNumber(A));

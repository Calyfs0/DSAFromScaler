function FibonacciNumber(A) {
  let arr = [];
  arr.push(0);
  arr.push(1);
  for (let i = 2; i <= A; i++) {
    arr.push(-1);
  }
  return findAthNum(A);
  function findAthNum(A) {
    if (arr[A] != -1) return arr[A];

    arr[A] = findAthNum(A - 1) + findAthNum(A - 2);
    return arr[A];
  }
}

A = 4;

console.log(FibonacciNumber(A));

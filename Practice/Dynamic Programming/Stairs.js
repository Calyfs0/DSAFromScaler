function Stairs(A) {
  let arr = [];

  for (let i = 0; i <= A; i++) {
    arr.push(-1);
  }

  return WaysToClimb(A);
  function WaysToClimb(A) {
    if (A == 1) return 1;
    if (A == 2) return 2;

    if (arr[A] != -1) return arr[A];

    arr[A] = WaysToClimb(A - 1) + WaysToClimb(A - 2);
    return arr[A];
  }
}

A = 3;

console.log(Stairs(A));

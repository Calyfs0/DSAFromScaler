function LetsParty(A) {
  let arr = [];

  for (let i = 0; i <= A; i++) {
    arr.push(-1);
  }

  let ans = calculate(A);
  let mod = 10003;

  return ans % mod;
  function calculate(A) {
    if (A == 1) return 1;
    if (A == 2) return 2;

    if (arr[A] != -1) return arr[A];

    arr[A] = calculate(A - 1) + calculate(A - 2);

    return arr[A];
  }
}
A = 5;
console.log(LetsParty(A));

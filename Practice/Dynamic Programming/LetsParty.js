function LetsParty(A) {
  let arr = Array(A + 1).fill(-1);
  let mod = 10003;
  calculate(A);

  return arr[arr.length - 1];
  function calculate(A) {
    if (A == 1) {
      arr[1] = 1;
      return arr[1];
    }

    if (A == 2) {
      arr[2] = 2;
      return arr[2];
    }

    if (arr[A] != -1) return arr[A];

    arr[A] =
      ((calculate(A - 1) % mod) + ((A - 1) % mod) * (calculate(A - 2) % mod)) %
      mod;

    return arr[A];
  }
}
A = 465;
console.log(LetsParty(A));

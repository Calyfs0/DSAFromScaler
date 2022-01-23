function LargestCoPrimeDivisor(A, B) {
  if (GCD(A, B) == 1) return A;
  let ans = 1;
  for (let i = 2; i * i <= A; i++) {
    if (A % i == 0) {
      if (GCD(B, i) == 1) ans = i;
      let fact2 = A / i;
      if (GCD(B, fact2) == 1) return fact2;
    }
  }

  return ans;
}

function GCD(A, B) {
  if (B == 0) return A;
  return GCD(B, A % B);
}

let A = 30;
let B = 12;

console.log(LargestCoPrimeDivisor(A, B));

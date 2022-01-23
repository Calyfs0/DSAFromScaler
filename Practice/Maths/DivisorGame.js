function DivisorGame(A, B, C) {
  let LCM = (B * C) / GCD(B, C);
  let count = 1;
  for (let i = LCM; i <= A; i = LCM * count) {
    count++;
  }
  return count - 1;
}

function GCD(A, B) {
  if (B == 0) return A;
  return GCD(B, A % B);
}

let A = 81991;
let B = 2549;
let C = 7;

console.log(DivisorGame(A, B, C));

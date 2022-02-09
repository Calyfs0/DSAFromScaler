A = [
  1, 31, 1, 1, 1, 1, 14, 2, 1, 1, 1, 2, 22, 1, 11, 1, 1, 1, 1, 23, 1, 1, 11, 1,
  11,
];
function AllGCDPairs(A) {
  A.sort(function (x, y) {
    return y - x;
  });
  let hs = new Map();
  let output = [];

  for (const x of A) {
    if (hs.has(x)) {
      hs.set(x, hs.get(x) - 1);
      if (hs.get(x) == 0) hs.delete(x);
    } else {
      for (const y of output) {
        let gcd = GCD(x, y);
        hs.set(gcd, hs.has(gcd) ? hs.get(gcd) + 2 : 2);
      }
      output.push(x);
    }
  }

  return output;
}

function GCD(A, B) {
  if (B == 0) return A;

  return GCD(B, A % B);
}

console.log(AllGCDPairs(A));

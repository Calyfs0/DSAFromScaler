function CyclicPermutation(A, B) {
  let s = B + "#" + A + A;
  let z = [s.length];
  let L = 0;
  let R = 0;

  for (let i = 1; i < s.length; i++) {
    if (i > R) {
      R = i;
      L = i;
      while (i < s.length && s[R] == s[R - L]) R++;
      z.push(R - L);
      R--;
    } else if (z[i - L] < R - i + 1) {
      z[i] = z[i - L];
    } else {
      L = i;
      while (i < s.length && s[R] == s[R - L]) R++;
      z.push(R - L);
      R--;
    }
  }

  let l = B.length;
  let ans = 0;
  for (let i = 0; i < z.length; i++) {
    if (z[i] == l) ans++;
  }
  if (A == B) return ans - 1;
  return ans;
}
let A = "0111111111";
let B = "1111111101";

console.log(CyclicPermutation(A, B));

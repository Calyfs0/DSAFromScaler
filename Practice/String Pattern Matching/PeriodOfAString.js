function PeriodOfAString(A) {
  let s = A;
  let z = [s.length];
  let L = 0;
  let R = 0;

  for (let i = 1; i < s.length; i++) {
    if (i > R) {
      L = i;
      R = i;
      while (R < s.length && s[R] == s[R - L]) R++;
      z.push(R - L);
      R--;
    } else if (z[i - L] < R - i + 1) {
      z[i] = z[i - L];
    } else {
      L = i;
      while (R < s.length && s[R] == s[R - L]) R++;
      z.push(R - L);
      R--;
    }
  }
  console.log(z);
  for (let i = 1; i < z.length; i++) {
    if (z[i] + i == A.length) return i;
  }

  return A.length;
}

A = "abababababb";
console.log(PeriodOfAString(A));

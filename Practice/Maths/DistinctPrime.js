function DistinctPrime(A) {
  let max = A[0];

  for (let i = 1; i < A.length; i++) {
    if (A[i] > max) max = A[i];
  }

  let spf = [];

  for (let i = 0; i < max; i++) {
    spf.push(1);
  }

  for (let i = 2; i < spf.length; i++) {
    if (spf[i] == 1) {
      for (let j = i; j < spf.length; j += i) {
        spf[j]++;
      }
    }
  }
  let ans = spf[0];
  for (let i = 1; i < spf.length; i++) {
    ans = Math.max(ans, spf[i]);
  }

  return ans;
}

A = [96, 98, 5, 41, 80];

console.log(DistinctPrime(A));

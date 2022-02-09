function SortedPermutationRank(A) {
  let mod = 1000003;
  let ans = 0;

  for (let i = 0; i < A.length; i++) {
    let count = 0;
    for (let j = i + 1; j < A.length; j++) {
      if (A[j] < A[i]) {
        count++;
      }
    }
    ans += count * fact(A.length - i - 1, mod);
  }

  return (ans + 1) % mod;
}

function fact(N, mod) {
  let ans = 1;
  while (N > 0) {
    ans *= N;
    ans = ans % mod;
    N--;
  }

  return ans;
}
let A = "gTFAMYjxCewRlftmGOKJHUy";

console.log(SortedPermutationRank(A));
//831052

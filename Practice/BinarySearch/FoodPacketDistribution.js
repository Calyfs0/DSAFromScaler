module.exports = {
  //param A : array of integers
  //param B : integer
  //return an integer
  solve: function (A, B) {
    let min = A[0];
    let sum = A[0];

    for (let i = 1; i < A.length; i++) {
      sum += A[i];
      min = Math.min(min, A[i]);
    }
    if (sum < B) return 0;

    let l = 1,
      r = min,
      ans = 0;

    while (l <= r) {
      let mid = Math.floor((l + r) / 2);
      if (check(mid, B, A)) {
        ans = mid;
        l = mid + 1;
      } else r = mid - 1;
    }

    return ans;
  },
};

function check(mid, B, A) {
  let count = 0;
  for (let i = 0; i < A.length; i++) {
    count += Math.floor(A[i] / mid);
  }

  return count >= B;
}

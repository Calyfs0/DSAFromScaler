A = [1, 2, -2, 4, -4];

const LargestContinuousSequenceZeroSum = A => {
  pref_A = [0];

  for (let i = 0; i < A.length; i++) {
    pref_A.push(pref_A[i] + A[i]);
  }

  let hm = new Map();

  hm['0'] = 0;
  let start = -1;
  let end = -1;
  ans = 0;
  for (let j = 0; j < pref_A.length; j++) {
    if (hm.has(pref_A[j])) {
      if (j - hm.get(pref_A[j]) > ans) {
        ans = j - hm.get(pref_A[j]);
        start = hm.get(pref_A[j]);
        end = j;
      }
    } else {
      hm.set(pref_A[j], j);
    }
  }

  let output = [];

  for (let i = start; i < end; i++) {
    output.push(A[i]);
  }

  return output;
};

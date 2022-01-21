function MinimumDistance(A) {
  let min_distance = Number.MAX_SAFE_INTEGER;
  let o = -1;
  let x = -1;
  for (let i = 0; i < A.length; i++) {
    if (A[i] == 'x') {
      x = i;
      if (o != -1) min_distance = Math.min(min_distance, Math.abs(o - x));
    } else if (A[i] == 'o') {
      o = i;
      if (x != -1) min_distance = Math.min(min_distance, Math.abs(o - x));
    }
  }

  if (min_distance == Number.MAX_SAFE_INTEGER) return -1;
  return min_distance;
}

A = 'x...o.x...o';

console.log(MinimumDistance(A));

function InfiniteKnapsack(A, B, C) {
  let dpMap = new Map();
  MaxAmount(B.length, A);

  return dpMap.get(B.length + " " + A);
  function MaxAmount(N, W) {
    if (N == 0 || W == 0) return 0;
    if (dpMap.has(N + " " + W)) return dpMap.has(N + " " + W);
    if (C[N - 1] <= W) {
      dpMap.set(
        N + " " + W,
        Math.max(MaxAmount(N - 1, W), MaxAmount(N, W - C[N - 1]) + B[N - 1])
      );
    } else {
      dpMap.set(N + " " + W, MaxAmount(N - 1, W));
    }

    return dpMap.get(N + " " + W);
  }
}

A = 10;
B = [6, 7];
C = [5, 5];

console.log(InfiniteKnapsack(A, B, C));

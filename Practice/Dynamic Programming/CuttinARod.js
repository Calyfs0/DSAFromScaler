function CuttingARod(A) {
  let N = A.length;
  let hs = new Map();
  let maxValue = 0;
  CalculateMaxValue(0, N);
  return maxValue;
  function CalculateMaxValue(i, N) {
    if (N == 0) {
      return 0;
    }
    if (hs.has(i + "" + N)) return hs.get(i + "" + N);

    hs.set(
      i + "" + N,
      Math.max(
        CalculateMaxValue(i, N - 1) + A[i],
        CalculateMaxValue(i + 1, N - 1) + A[i]
      )
    );
    maxValue = Math.max(maxValue, hs.get(i + "" + N));
    return hs.get(i + "" + N);
  }
}

A = [3, 4, 1, 6, 2];

console.log(CuttingARod(A));

function ZeroOneKnapsack(A, B, C) {
  let weightMap = new Map();
  findMaxValue(A.length, C);
  return weightMap.get(A.length + " " + C);
  function findMaxValue(nofOfItem, weight) {
    if (nofOfItem == 0 || weight == 0) return 0;

    if (weightMap.has(nofOfItem + " " + weight))
      return weightMap.get(nofOfItem + " " + weight);

    if (B[nofOfItem - 1] <= weight) {
      weightMap.set(
        nofOfItem + " " + weight,
        Math.max(
          findMaxValue(nofOfItem - 1, weight),
          findMaxValue(nofOfItem - 1, weight - B[nofOfItem - 1]) +
            A[nofOfItem - 1]
        )
      );
    } else
      weightMap.set(
        nofOfItem + " " + weight,
        findMaxValue(nofOfItem - 1, weight)
      );

    return weightMap.get(nofOfItem + " " + weight);
  }
}

A = [60, 100, 120];
B = [10, 20, 30];
C = 50;

console.log(ZeroOneKnapsack(A, B, C));

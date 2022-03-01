function EqualTreePartition(A) {
  let totalSum = 0;
  let hs = new Set();
  Sum(A);
  function Sum(A) {
    if (A == null) return 0;
    let leftSum = Sum(A.left);
    let rightSum = Sum(A.right);
    totalSum = leftSum + rightSum + A.data;
    hs.add(totalSum);
    return totalSum;
  }
  if (totalSum == 0 || totalSum % 2 != 0) return 0;
  if (hs.has(Math.floor(totalSum / 2))) return 1;
  return 0;
}

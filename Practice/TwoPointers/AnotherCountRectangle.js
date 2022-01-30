function AnotherCountRectangle(A, B) {
  let count = 0;
  let p1 = 0;
  let p2 = A.length - 1;

  while (p1 <= p2) {
    let prod = A[p1] * A[p2];
    if (prod < B) {
      count += (p2 - p1) * 2;
      if (A[p1] * A[p1] < B) count++;
      p1++;
    } else {
      p2--;
    }
  }
  return count % 1000000007;
}

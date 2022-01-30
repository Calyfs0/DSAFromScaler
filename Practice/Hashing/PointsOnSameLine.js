function PointOnSameLine(A, B) {
  let maxcount = 0;
  for (let i = 0; i < A.length; i++) {
    let coordinateX1 = A[i];
    let coordinateY1 = B[i];
    let count = 0;
    let hm = new Map();
    for (let j = 0; j < B.length; j++) {
      if (i == j) continue;
      if (A[i] == A[j] && B[i] == B[j]) {
        count++;
        continue;
      }
      let coordinateX2 = A[j];
      let coordinateY2 = B[j];

      let slope = (coordinateY2 - coordinateY1) / (coordinateX2 - coordinateX1);
      if (hm.has(slope)) {
        hm.set(slope, hm.get(slope) + 1);
        count = Math.max(count, hm.get(slope));
      } else hm.set(slope, 1);
    }
    maxcount = Math.max(maxcount, count);
  }
  if (maxcount < 2) return 2;
  else return maxcount + 1;
}

function GCD(A, B) {
  if (B <= 0) return A;
  return GCD(B, A % B);
}
//A = [0, -3, -6, 0, -7, 0, 2, 0, 5];
//B = [-9, -7, -8, -4, -3, 0, -9, -3, 7];
A = [3, 1, 4, 5, 7, -9, -8, 6];
B = [4, -8, -3, -2, -1, 5, 7, -4];
console.log(PointOnSameLine(A, B));

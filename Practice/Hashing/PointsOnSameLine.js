function PointOnSameLine(A, B) {
  if (A.length == 1) return 1;
  const hm = new Map();
  let max_count = 0;
  let index = 0;

  for (let i = 0; i < A.length; i++) {
    let slope = null;
    let count = 1;
    for (let j = 0; j < B.length; j++) {
      if (i == j) continue;
      if (A[i] == A[j] && B[i] == B[j]) {
        count++;
        continue;
      }
      let val1 = A[j] - A[i];
      let val2 = B[j] - B[i];
      let curr_slope = null;
      if (val1 == val2) curr_slope = 1;
      else if (val2 == 0) curr_slope = val1;
      else {
        let gcd = GCD(Math.abs(val1), Math.abs(val2));
        val1 = val1 / gcd;
        val2 = val2 / gcd;
        curr_slope = val1 / val2;
      }
      //hm.set(curr_slope, hm.has(curr_slope) ? hm.get(curr_slope) + 1 : 1);
      if (slope == null) slope = curr_slope;
      else if (curr_slope == slope) count++;
    }
    if (count > max_count) {
      index = i;
    }
    max_count = Math.max(count, max_count);
  }
  //console.log(hm);
  return max_count;
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

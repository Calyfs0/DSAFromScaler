A = [1, 2, 3, 4, 5];
B = [5, 4, 2];

function SortArrayInGivenOrder(A, B) {
  let hm = new Map();

  for (let i = 0; i < A.length; i++) {
    hm.set(A[i], hm.has(A[i]) ? hm.get(A[i]) + 1 : 1);
  }
  let output = [];
  for (let j = 0; j < B.length; j++) {
    while (hm.has(B[j])) {
      hm.set(B[j], hm.get(B[j]) - 1);
      if (hm.get(B[j]) == 0) hm.delete(B[j]);
      output.push(B[j]);
    }
  }

  for (let i = 0; i < A.length; i++) {
    if (hm.has(A[i])) output.push(A[i]);
  }

  return output;
}

console.log(SortArrayInGivenOrder(A, B));

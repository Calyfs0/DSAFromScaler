function CommonElements(A, B) {
  const hm = new Map();
  let output = [];
  for (let i = 0; i < B.length; i++) {
    hm.set(B[i], hm.has(B[i]) ? hm.get(B[i]) + 1 : 1);
  }

  for (let i = 0; i < A.length; i++) {
    if (hm.has(A[i])) {
      output.push(A[i]);
      hm.set(A[i], hm.get(A[i]) - 1);
      if (hm.get(A[i]) == 0) hm.delete(A[i]);
    }
  }

  return output;
}

A = [1, 2, 2, 1];
B = [2, 3, 1, 2];
console.log(CommonElements(A, B));

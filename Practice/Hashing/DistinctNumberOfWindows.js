const A = [1, 2, 1, 3, 4, 3];
const B = 3;

const DistinctNumberOfWindows = (A, B) => {
  let output = [];
  if (B > A.length) {
    return output;
  }

  let hs = new Map();

  for (let i = 0; i < B; i++) {
    hs.set(A[i], hs.has(A[i]) ? hs.get(A[i]) + 1 : 1);
  }

  output.push(hs.size);

  for (let i = B; i < A.length; i++) {
    hs.set(A[i - B], hs.get(A[i - B]) - 1);
    if (hs.get(A[i - B]) == 0) hs.delete(A[i - B]);
    hs.set(A[i], hs.has(A[i]) ? hs.get(A[i]) + 1 : 1);
    output.push(hs.size);
  }

  return output;
};

console.log(DistinctNumberOfWindows(A, B));

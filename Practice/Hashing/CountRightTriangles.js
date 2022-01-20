function CountRightTriangles(A, B) {
  const arr = [];
  const hmX = new Map();
  const hmY = new Map();

  for (let i = 0; i < A.length; i++) {
    let ar = [A[i], B[i]];
    arr.push(ar);
    hmX.set(A[i], hmX.has(A[i]) ? hmX.get(A[i]) + 1 : 1);
    hmY.set(B[i], hmY.has(B[i]) ? hmY.get(B[i]) + 1 : 1);
  }
  let ans = 0;
  for (let i = 0; i < arr.length; i++) {
    let x = arr[i][0];
    let y = arr[i][1];

    let xVal = hmX.get(x) - 1;
    let yVal = hmY.get(y) - 1;

    ans += xVal * yVal;
  }

  return ans;
}

A = [1, 1, 2];
B = [1, 2, 1];

console.log(CountRightTriangles(A, B));

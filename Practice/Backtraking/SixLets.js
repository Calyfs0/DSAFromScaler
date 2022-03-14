function SixLets(A, B) {
  let count = 0;
  let output = [];
  findSixLets(A, 0, A.length);
  return count;
  function findSixLets(A, i, n) {
    if (i == n) {
      if (output.length == B) {
        let sum = 0;
        for (let i = 0; i < output.length; i++) {
          sum += output[i];
        }
        if (sum <= 1000) count++;
      }
      return;
    }

    output.push(A[i]);
    findSixLets(A, i + 1, n);
    output.pop();
    findSixLets(A, i + 1, n);
  }
}

A = [5, 17, 1000, 11];
B = 4;

console.log(SixLets(A, B));

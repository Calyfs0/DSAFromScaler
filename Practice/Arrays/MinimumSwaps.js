function MinimumSwaps(A, B) {
  let LessOrEqualNumbers = 0;

  for (let i = 0; i < A.length; i++) {
    if (A[i] <= B) LessOrEqualNumbers++;
  }
  let badNumbers = 0;
  let goodNumbers = 0;

  for (let i = 0; i < LessOrEqualNumbers; i++) {
    if (A[i] <= B) goodNumbers++;
    else badNumbers++;
  }
  let ans = badNumbers;

  for (let i = LessOrEqualNumbers; i < A.length; i++) {
    if (A[i] <= B) goodNumbers++;
    else badNumbers++;
    if (A[i - LessOrEqualNumbers] <= B) goodNumbers--;
    else badNumbers--;

    ans = Math.min(ans, badNumbers);
  }

  return ans;
}

A = [1, 12, 10, 3, 14, 10, 5];
B = 8;

console.log(MinimumSwaps(A, B));

function SumOfMinOrMax(A, B) {
  let maxDeque = [];
  let minDeque = [];
  let output = 0;
  let mod = 1000000009;
  for (let i = 0; i < B; i++) {
    let maxDequeLength = maxDeque.length;
    let minDequeLength = minDeque.length;

    while (maxDequeLength && maxDeque[maxDequeLength - 1] < A[i]) {
      maxDeque.pop();
      maxDequeLength--;
    }

    while (minDequeLength && minDeque[minDequeLength - 1] > A[i]) {
      minDeque.pop();
      minDequeLength--;
    }
    maxDeque.push(A[i]);
    minDeque.push(A[i]);
  }

  output = (output + (maxDeque[0] % mod) + (minDeque[0] % mod)) % mod;
  if (output < 0) output = output % mod;

  for (let i = B; i < A.length; i++) {
    let val = A[i];
    if (A[i - B] == maxDeque[0]) {
      maxDeque.shift();
    }

    if (A[i - B] == minDeque[0]) {
      minDeque.shift();
    }
    let maxDequeLength = maxDeque.length;
    let minDequeLength = minDeque.length;
    while (maxDequeLength && maxDeque[maxDequeLength - 1] < A[i]) {
      maxDeque.pop();
      maxDequeLength--;
    }

    while (minDequeLength && minDeque[minDequeLength - 1] > A[i]) {
      minDeque.pop();
      minDequeLength--;
    }
    maxDeque.push(A[i]);
    minDeque.push(A[i]);
    output = (output + (maxDeque[0] % mod) + (minDeque[0] % mod)) % mod;
    if (output < 0) output = output % mod;
  }

  return output;
}

A = [2, 5, -1, 7, -3, -1, -2];
B = 4;

console.log(SumOfMinOrMax(A, B));

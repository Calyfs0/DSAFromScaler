function slidingMaximum(A, B) {
  let output = [];
  let deque = [];
  for (let i = 0; i < B; i++) {
    let l = deque.length;
    while (l && deque[l - 1] < A[i]) {
      deque.pop();
      l--;
    }
    deque.push(A[i]);
  }
  output.push(deque[0]);

  for (let i = B; i < A.length; i++) {
    if (deque[0] == A[i - B]) {
      deque.shift();
    }
    let l = deque.length;
    while (l && deque[l - 1] < A[i]) {
      deque.pop();
      l--;
    }
    deque.push(A[i]);
    output.push(deque[0]);
  }

  return output;
}

A = [1, 3, -1, -3, 5, 3, 6, 7];
B = 3;

console.log(slidingMaximum(A, B));

function ConnectRopes(A) {
  BuildMinHeap(A);
  let output = 0;
  while (A.length > 1) {
    let firstMin = ExtractMin(A);

    let secondMin = ExtractMin(A);
    let val = firstMin + secondMin;
    output += val;
    insertValue(A, val);
  }
  return output;
}

function BuildMinHeap(A) {
  let startIndex = Math.floor(A.length / 2) - 1;
  while (startIndex >= 0) {
    Heapify(A, startIndex);
    startIndex--;
  }
}

function ExtractMin(A) {
  swap(A, 0, A.length - 1);
  let min = A.pop();
  Heapify(A, 0);
  return min;
}

function insertValue(A, val) {
  A.push(val);
  Heapify(A, 0);
}

function Heapify(A, index) {
  while (2 * index + 1 < A.length) {
    let leftIndex = 2 * index + 1;
    let min = Math.min(A[index], A[leftIndex]);
    if (2 * index + 2 < A.length) {
      let rightIndex = 2 * index + 2;
      min = Math.min(min, A[rightIndex]);
      if (A[index] == min) return;
      if (A[leftIndex] == min) {
        swap(A, leftIndex, index);
        index = leftIndex;
      } else {
        swap(A, rightIndex, index);
        index = rightIndex;
      }
    } else if (min == A[leftIndex]) {
      swap(A, leftIndex, index);
      index = leftIndex;
    } else return;
  }
}

function swap(A, i, j) {
  let temp = A[i];
  A[i] = A[j];
  A[j] = temp;
}

let A = [6, 19, 9, 14, 17, 16, 7, 2, 14, 4, 3];
console.log(ConnectRopes(A));

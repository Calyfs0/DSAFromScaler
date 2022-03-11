function KPlacesApart(A, B) {
  let output = [];
  let minHeap = [];
  for (let i = 0; i <= B; i++) {
    minHeap.push(A[i]);
  }

  BuildMinHeap(minHeap);
  output.push(ExtractMin(minHeap));
  for (let i = B + 1; i < A.length; i++) {
    insertValue(minHeap, A[i]);
    output.push(ExtractMin(minHeap));
  }

  while (minHeap.length > 0) {
    output.push(ExtractMin(minHeap));
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
  let index = A.length - 1;
  let parentIndex = Math.floor((index - 1) / 2);
  while (index > 0) {
    if (A[parentIndex] > A[index]) {
      swap(A, parentIndex, index);
    }
    index = parentIndex;
    parentIndex = Math.floor((index - 1) / 2);
  }
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
A = [25, 16, 11, 31, 28, 20, 3, 8];
B = 6;
console.log(KPlacesApart(A, B));

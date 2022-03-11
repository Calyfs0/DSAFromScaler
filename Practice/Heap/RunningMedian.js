function RunningMedian(A) {
  let leftMaxHeap = [A[0]];
  let rightMinHeap = [];
  let output = [A[0]];

  for (let i = 1; i < A.length; i++) {
    if (A[i] < leftMaxHeap[0]) {
      insertValueAtMaxHeap(leftMaxHeap, A[i]);
      if (leftMaxHeap.length - rightMinHeap.length > 1) {
        insertValueAtMinHeap(rightMinHeap, ExtractMax(leftMaxHeap));
      }
    } else {
      insertValueAtMinHeap(rightMinHeap, A[i]);
      if (rightMinHeap.length > leftMaxHeap.length) {
        insertValueAtMaxHeap(leftMaxHeap, ExtractMin(rightMinHeap));
      }
    }
    output.push(leftMaxHeap[0]);
  }

  return output;
}

function ExtractMin(A) {
  swap(A, 0, A.length - 1);
  let min = A.pop();
  MinHeapify(A, 0);
  return min;
}

function insertValueAtMinHeap(A, val) {
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

function MinHeapify(A, index) {
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

function ExtractMax(B) {
  swap(B, 0, B.length - 1);
  let maxValue = B.pop();
  MaxHeapify(B, 0);
  return maxValue;
}

function insertValueAtMaxHeap(B, num) {
  B.push(num);
  let currIndex = B.length - 1;
  let parentIndex = Math.floor((currIndex - 1) / 2);
  while (currIndex > 0) {
    if (B[parentIndex] < B[currIndex]) {
      swap(B, currIndex, parentIndex);
    }
    currIndex = parentIndex;
    parentIndex = Math.floor((currIndex - 1) / 2);
  }
}

function MaxHeapify(B, index) {
  while (2 * index + 1 < B.length) {
    let leftIndex = 2 * index + 1;
    let max = Math.max(B[index], B[leftIndex]);
    if (2 * index + 2 < B.length) {
      let rightIndex = 2 * index + 2;
      max = Math.max(B[leftIndex], B[rightIndex], max);
      if (max == B[index]) {
        return;
      }
      if (max == B[leftIndex]) {
        swap(B, leftIndex, index);
        index = leftIndex;
      } else {
        swap(B, rightIndex, index);
        index = rightIndex;
      }
    } else if (max == B[leftIndex]) {
      swap(B, leftIndex, index);
      index = leftIndex;
    } else return;
  }
}
A = [5, 17, 100, 11];
console.log(RunningMedian(A));

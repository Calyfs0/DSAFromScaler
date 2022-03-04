const MaximumSUmArrayAfterBNegations = (A, B) => {
  let sum = 0;

  //Create Min Heap
  BuildMinHeap(A);
  while (B > 0) {
    //Extract Min
    let min = ExtractMin(A);
    //Heapify
    Heapify(A, 0);
    insertValue(A, min * -1);

    B--;
  }
  for (let i = 0; i < A.length; i++) {
    sum += A[i];
  }

  return sum;
};

const insertValue = (A, val) => {
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
};
const BuildMinHeap = (A) => {
  let startIndex = Math.floor(A.length / 2) - 1;
  while (startIndex >= 0) {
    Heapify(A, startIndex);
    startIndex--;
  }
};

const ExtractMin = (A) => {
  swap(A, 0, A.length - 1);
  return A.pop();
};

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

const swap = (A, i, j) => {
  const temp = A[i];
  A[i] = A[j];
  A[j] = temp;
};

A = [24, -68, -29, -9, 84];
B = 4;
console.log(MaximumSUmArrayAfterBNegations(A, B));

let ProductOf3 = (A) => {
  let output = [];
  if (A.length < 3) {
    for (let i = 0; i < A.length; i++) {
      output.push(-1);
    }
    return output;
  }
  output.push(-1);
  output.push(-1);
  let input = [];
  for (let i = 0; i < 3; i++) {
    input.push(A[i]);
  }
  CreateMaxHeap(input);
  let firstMax = GetMaxValue(input);
  Heapify(input, 0);
  let secondMax = GetMaxValue(input);
  Heapify(input, 0);
  let thirdMax = GetMaxValue(input);
  Heapify(input, 0);
  let val = firstMax * secondMax * thirdMax;
  output.push(val);

  for (let i = 3; i < A.length; i++) {
    if (firstMax < A[i]) {
      thirdMax = secondMax;
      secondMax = firstMax;
      firstMax = A[i];
    } else if (secondMax < A[i]) {
      thirdMax = secondMax;
      secondMax = A[i];
    } else if (thirdMax < A[i]) {
      thirdMax = A[i];
    }
    let val = firstMax * secondMax * thirdMax;
    output.push(val);
  }

  return output;

  function CreateMaxHeap(input) {
    let startIndex = Math.floor(input.length / 2) - 1;
    while (startIndex >= 0) {
      Heapify(input, startIndex);
      startIndex--;
    }
  }

  function insertNewValue(val) {
    input.push(val);
    Heapify(input, 0);
  }

  function GetMaxValue(input) {
    swap(input, 0, input.length - 1);
    return input.pop();
  }

  function Heapify(input, index) {
    while (2 * index + 1 < input.length) {
      let leftIndex = 2 * index + 1;
      let max = Math.max(input[index], input[leftIndex]);
      if (2 * index + 2 < input.length) {
        let rightIndex = 2 * index + 2;
        max = Math.max(max, input[rightIndex]);
        if (max == input[index]) return;
        if (max == input[leftIndex]) {
          swap(input, leftIndex, index);
          index = leftIndex;
        } else {
          swap(input, rightIndex, index);
          index = rightIndex;
        }
      } else if (max == input[leftIndex]) {
        swap(input, leftIndex, index);
        index = leftIndex;
      } else return;
    }
  }

  function swap(A, i, j) {
    let temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
};

A = [10, 2, 13, 4];
console.log(ProductOf3(A));

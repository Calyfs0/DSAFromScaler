function MagicianAndChocolates(A, B) {
  let mod = 1000000007;
  let output = 0;
  //1. Build a max heap
  BuildHeap(B);
  //2. extract max element
  while (A > 0) {
    A--;
    let max = ExtractMax(B);
    Heapify(B, 0);
    //3. add it to the answer
    output = ((output % mod) + (max % mod)) % mod;

    //4. Reduce it to half
    max = Math.floor(max / 2);
    //5. Insert it back to the heap
    InsertElement(B, max);
  }

  return output;
}

function BuildHeap(B) {
  let startIndex = Math.floor(B.length / 2) - 1;
  while (startIndex >= 0) {
    Heapify(B, startIndex);
    startIndex--;
  }
}

function ExtractMax(B) {
  swap(B, 0, B.length - 1);
  let maxValue = B.pop();
  return maxValue;
}

function InsertElement(B, num) {
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

function Heapify(B, index) {
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

function swap(B, index1, index2) {
  let temp = B[index1];
  B[index1] = B[index2];
  B[index2] = temp;
}

A = 5;
B = [2, 4, 6, 8, 10];

console.log(MagicianAndChocolates(A, B));

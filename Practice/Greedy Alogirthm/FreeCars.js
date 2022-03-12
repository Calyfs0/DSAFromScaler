function FreeCars(A, B) {
  let maxProfit = 0;
  let mod = 1000000007;
  let minHeap = [];
  let input = A.map(function (item, i) {
    return [item, B[i]];
  });

  input.sort(function (a, b) {
    return a[0] - b[0];
  });
  let time = 0;
  let minimumValue = Number.MAX_SAFE_INTEGER;
  for (let i = 0; i < input.length; i++) {
    if (input[i][0] > time) {
      time++;
      InsertInMinHeap(minHeap, input[i][1]);
    } else if (input[i][1] > minHeap[0]) {
      ExtractMin(minHeap);
      InsertInMinHeap(minHeap, input[i][1]);
    }
  }

  minHeap.forEach((val) => (maxProfit += val));
  return maxProfit % mod;
}

function ExtractMin(arr) {
  swap(arr, 0, arr.length - 1);
  arr.pop();
  Heapify(arr, 0);
}

function Heapify(arr, startIndex) {
  while (2 * startIndex + 1 < arr.length) {
    let left = 2 * startIndex + 1;
    let min = Math.min(arr[left], arr[startIndex]);
    if (2 * startIndex + 2 < arr.length) {
      let right = 2 * startIndex + 2;
      min = Math.min(min, arr[right]);
      if (min == arr[right]) {
        swap(arr, startIndex, right);
        startIndex = right;
      } else if (min == arr[left]) {
        swap(arr, startIndex, left);
        startIndex = left;
      } else return;
    } else {
      if (min == arr[left]) {
        swap(arr, startIndex, left);
        startIndex = left;
      } else return;
    }
  }
}

function InsertInMinHeap(arr, val) {
  arr.push(val);
  let curr_index = arr.length - 1;
  while (curr_index > 0) {
    let parent = Math.floor((curr_index - 1) / 2);
    if (arr[parent] > arr[curr_index]) {
      swap(arr, parent, curr_index);
    }
    curr_index = parent;
  }
}

function swap(arr, i, j) {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

A = [1, 3, 2, 3, 3];
B = [5, 6, 1, 3, 9];

FreeCars(A, B);

A = [4, 7, 3, 8];

function MaxAndMin(A) {
  let mod = 1000000007;
  let leftGreaterArray = [];
  let leftGreaterStack = [];
  let leftTop = null;

  let rightGreaterArray = [];
  let rightGreaterStack = [];
  let rightTop = null;

  let maxSubValue = 0;
  let minSubValue = 0;

  for (let i = 0; i < A.length; i++) {
    leftTop = getTop(leftGreaterStack);
    while (leftTop != null && A[leftTop] <= A[i]) {
      leftGreaterStack.pop();
      leftTop = getTop(leftGreaterStack);
    }

    leftGreaterArray.push(leftTop == null ? -1 : leftTop);
    leftGreaterStack.push(i);

    rightTop = getTop(rightGreaterStack);
    while (rightTop != null && A[rightTop] <= A[A.length - 1 - i]) {
      rightGreaterStack.pop();
      rightTop = getTop(rightGreaterStack);
    }
    rightGreaterArray.push(rightTop == null ? A.length : rightTop);
    rightGreaterStack.push(A.length - 1 - i);
  }
  for (let i = 0; i < A.length; i++) {
    maxSubValue +=
      A[i] *
      (i - leftGreaterArray[i]) *
      (rightGreaterArray[A.length - 1 - i] - i);
  }

  leftGreaterArray = [];
  leftGreaterStack = [];
  leftTop = null;

  rightGreaterArray = [];
  rightGreaterStack = [];
  rightTop = null;
  for (let i = 0; i < A.length; i++) {
    leftTop = getTop(leftGreaterStack);
    while (leftTop != null && A[leftTop] >= A[i]) {
      leftGreaterStack.pop();
      leftTop = getTop(leftGreaterStack);
    }
    leftGreaterArray.push(leftTop == null ? -1 : leftTop);
    leftGreaterStack.push(i);

    rightTop = getTop(rightGreaterStack);
    while (rightTop != null && A[rightTop] >= A[A.length - 1 - i]) {
      rightGreaterStack.pop();
      rightTop = getTop(rightGreaterStack);
    }

    rightGreaterArray.push(rightTop == null ? A.length : rightTop);
    rightGreaterStack.push(A.length - 1 - i);
  }

  for (let i = 0; i < A.length; i++) {
    minSubValue +=
      A[i] *
      (i - leftGreaterArray[i]) *
      (rightGreaterArray[A.length - 1 - i] - i);
  }

  return (maxSubValue - minSubValue) % mod;
}

function getTop(stack) {
  if (stack.length == 0) return null;
  return stack[stack.length - 1];
}

console.log(MaxAndMin(A));

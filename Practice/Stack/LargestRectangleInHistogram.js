let LargestRectangleInHistogram = function (A) {
  let leftStack = [];
  let rightStack = [];
  let leftTop = [];
  let rightTop = [];
  let leftArray = [];
  let rightArray = [];
  let sum = 0;
  for (let i = 0; i < A.length; i++) {
    leftTop = getTop(leftStack);
    while (leftTop != null && A[leftTop] >= A[i]) {
      leftStack.pop();
      leftTop = getTop(leftStack);
    }
    leftArray.push(leftTop == null ? 0 : leftTop + 1);
    leftStack.push(i);

    rightTop = getTop(rightStack);
    while (rightTop != null && A[rightTop] >= A[A.length - 1 - i]) {
      rightStack.pop();
      rightTop = getTop(rightStack);
    }

    rightArray.push(rightTop == null ? A.length - 1 : rightTop - 1);
    rightStack.push(A.length - 1 - i);
  }

  for (let i = 0; i < A.length; i++) {
    sum = Math.max(
      sum,
      A[i] * (rightArray[rightArray.length - 1 - i] - leftArray[i] + 1)
    );
  }

  return sum;
};

A = [90, 58, 69, 70, 82, 100, 13, 57, 47, 18];
console.log(LargestRectangleInHistogram(A));
function getTop(stack) {
  if (stack.length == 0) return null;
  return stack[stack.length - 1];
}

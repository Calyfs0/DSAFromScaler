function OddAndEvenLevel(A) {
  let level = 1;
  let oddSum = 0;
  let evenSum = 0;
  let queue = [A];

  while (queue.length > 0) {
    let count = queue.length;
    if (level % 2 == 0) {
      while (count--) {
        let val = queue.shift();
        if (val != -1 && val != null) {
          evenSum += val.data;
          queue.push(val.left == null ? -1 : val.left);
          queue.push(val.right == null ? -1 : val.right);
        }
      }
    } else {
      while (count--) {
        let val = queue.shift();
        if (val != -1 && val != null) {
          oddSum += val.data;
          queue.push(val.left == null ? -1 : val.left);
          queue.push(val.right == null ? -1 : val.right);
        }
      }
    }
  }

  return oddSum - evenSum;
}

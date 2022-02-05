function NIntegersContaining123(A) {
  let arr = [];
  let count = 0;
  let l = -1;

  while (count < A) {
    num1 = (l == -1 ? 0 : arr[l] * 10) + 1;
    arr.push(num1);
    count++;
    if (count == A) {
      return arr;
    }
    num2 = (l == -1 ? 0 : arr[l] * 10) + 2;
    arr.push(num2);
    count++;
    if (count == A) {
      return arr;
    }

    num3 = (l == -1 ? 0 : arr[l] * 10) + 3;
    arr.push(num3);
    count++;

    l++;
  }
  return arr;
}

console.log(NIntegersContaining123(9));

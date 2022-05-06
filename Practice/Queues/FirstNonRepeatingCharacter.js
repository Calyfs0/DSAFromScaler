function FirstNonRepeatingCharacter(A) {
  let deque = [];
  deque.push(A[0]);
  let outputString = "";
  outputString += A[0];
  let hm = {};
  hm[A[0]] = 1;
  for (let i = 1; i < A.length; i++) {
    let val = A[i];
    if (val == deque[0]) {
      deque.shift();
      hm[val] = hm[val] + 1;
    } else {
      deque.push(val);
      if (hm[val] != null) {
        hm[val] = hm[val] + 1;
      } else {
        hm[val] = 1;
      }
    }
    while (hm[deque[0]] > 1) {
      deque.shift();
    }
    if (deque.length > 0) {
      outputString += deque[0];
    } else outputString += "#";
  }

  return outputString;
}

A = "rzgbjnrbriuqwcbgndnqiddjzpbglrkzhclejgih";

console.log(FirstNonRepeatingCharacter(A));

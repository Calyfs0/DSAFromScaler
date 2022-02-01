let DoubleCharacterTrouble = function (A) {
  let stack = [];
  for (const c of A) {
    if (stack.length == 0) stack.push(c);
    else {
      let top = stack[stack.length - 1];
      if (top == c) {
        stack.pop();
      } else stack.push(c);
    }
  }

  return stack.join("");
};

let str = `abbabbcd`;
console.log(DoubleCharacterTrouble(str));

let BalancedParanthesis = function (str) {
  let stack = [];
  for (const c of str) {
    if (`[({`.includes(c)) {
      stack.push(c);
    } else if (c == `]`) {
      if (stack.length == 0 || stack[stack.length - 1] != `[`) return 0;
      stack.pop();
    } else if (c == `}`) {
      if (stack.length == 0 || stack[stack.length - 1] != `{`) return 0;
      stack.pop();
    } else if (c == `)`) {
      if (stack.length == 0 || stack[stack.length - 1] != `(`) return 0;
      stack.pop();
    }
  }

  if (stack.length > 0) return 0;
  return 1;
};
let str = `(((((((`;
console.log(str);
console.log(BalancedParanthesis(str));

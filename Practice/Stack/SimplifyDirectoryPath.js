function SimplifyDirectoryPath(A) {
  let arr = A.split(`/`);
  if (A[0] == `/`) arr.shift();

  if (A[A.length - 1] == `/`) arr.pop();

  let stack = [];

  for (const x of arr) {
    if (x == `..`) {
      stack.pop();
    } else if (x != `.`) {
      stack.push(x);
    }
  }
  if (stack.length == 0) return `/`;
  return `/` + stack.join(`/`).replace(`//`, `/`);
}

let str = `/a/./b/../../c/`;
console.log(SimplifyDirectoryPath(str));

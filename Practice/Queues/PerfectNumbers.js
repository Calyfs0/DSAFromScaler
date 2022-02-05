function PerfectNumbers(A) {
  let arr = [];
  let count = 2;
  let l = -1;
  let r = 1;
  ans = 0;
  if (A == 1) {
    return 11;
  } else if (A == 2) {
    return 22;
  }

  arr.push(1);
  arr.push(2);
  while (count < A) {
    l++;
    num1 = arr[l] * 10 + 1;
    count++;
    if (count == A) {
      ans = num1;
      break;
    }
    num2 = arr[l] * 10 + 2;
    ans = num2;
    count++;

    arr.push(num1);
    r++;
    arr.push(num2);
    r++;
  }

  let stringNum = ans.toString();
  let final_output = stringNum + ReverseNumber(ans);
  return final_output;
}

function ReverseNumber(N) {
  let s = N.toString();
  let ss = s.split("");
  ss = ss.reverse();
  let output = ss.join("");
  return Number(output);
}

let A = 4;

console.log(PerfectNumbers(A));

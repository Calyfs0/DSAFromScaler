function ValidParenthesis(s) {
  s = s.toLowerCase();
  let loweralphabets =
    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  let i = 0;
  let j = s.length - 1;

  while (i < j) {
    while (!loweralphabets.includes(s[i]) && i < j) {
      i++;
    }

    while (!loweralphabets.includes(s[j]) && j > i) {
      j--;
    }

    if (s[i] == s[j]) {
      i++;
      j--;
    } else {
      return false;
    }
  }
  return true;
}

s = "0P";

console.log(ValidParenthesis(s));

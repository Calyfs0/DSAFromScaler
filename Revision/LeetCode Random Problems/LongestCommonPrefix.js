function LongestCommonPrefix(strs) {
  let str = "";
  let length = Number.MAX_VALUE;
  for (let i = 0; i < strs.length; i++) {
    if (strs[i].length < length) {
      str = strs[i];
      length = strs[i].length;
    }
  }

  for (let i = 0; i < strs.length; i++) {
    while (!strs[i].startsWith(str)) {
      str = str.substring(0, str.length - 1);
    }
  }

  return str;
}

let strs = ["reflower", "flow", "flight"];

console.log(LongestCommonPrefix(strs));

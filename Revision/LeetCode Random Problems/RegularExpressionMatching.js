let inputString = "aaa";
let pattern = "ab*a*c*a";
let dp = {};
console.log(
  IsMatch(inputString, pattern, inputString.length - 1, pattern.length - 1)
);
function IsMatch(inputString, pattern, i, j) {
  if (i < 0 && j < 0) return true;
  if (j < 0 && i >= 0) return false;
  if (i < 0 && j >= 0) {
    while (j >= 0) {
      if (pattern[j] != "*") return false;
      j -= 2;
    }
    return true;
  }

  if (dp[i + "" + j] != null) {
    return dp[i + "" + j];
  }

  if (pattern[j] == "." || pattern[j] == inputString[i]) {
    dp[i + "" + j] = IsMatch(inputString, pattern, i - 1, j - 1);
  } else if (
    pattern[j] == "*" &&
    (pattern[j - 1] == inputString[i] || pattern[j - 1] == ".")
  ) {
    dp[i + "" + j] =
      IsMatch(inputString, pattern, i - 1, j) ||
      IsMatch(inputString, pattern, i, j - 2);
  } else if (pattern[j] == "*") {
    dp[i + "" + j] = IsMatch(inputString, pattern, i, j - 2);
  } else dp[i + "" + j] = false;

  return dp[i + "" + j];
}

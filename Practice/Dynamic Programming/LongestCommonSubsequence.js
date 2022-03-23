function LongestCommonSubsequence(A, B) {
  let fSL = A.length; //firstStringLength
  let sSL = B.length; //secondStringLength

  let commonSubsequenceCountArray = Array.from(Array(fSL), () =>
    Array(sSL).fill(-1)
  );
  let ans = FindLongestCommonSubsequence(fSL - 1, sSL - 1);
  return ans;
  function FindLongestCommonSubsequence(fSL, sSL) {
    if (fSL < 0 || sSL < 0) {
      return 0;
    }

    if (commonSubsequenceCountArray[fSL][sSL] != -1)
      return commonSubsequenceCountArray[fSL][sSL];

    if (A[fSL] == B[sSL]) {
      commonSubsequenceCountArray[fSL][sSL] =
        1 + FindLongestCommonSubsequence(fSL - 1, sSL - 1);
    } else {
      commonSubsequenceCountArray[fSL][sSL] = Math.max(
        FindLongestCommonSubsequence(fSL - 1, sSL),
        FindLongestCommonSubsequence(fSL, sSL - 1)
      );
    }

    return commonSubsequenceCountArray[fSL][sSL];
  }
}

A = "aaaaaa";
B = "ababab";

console.log(LongestCommonSubsequence(A, B));

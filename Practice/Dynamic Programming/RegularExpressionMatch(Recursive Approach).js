function RegularExpressionMatch(A, B) {
  let fSL = A.length;
  let sSL = B.length;

  let stringArray = Array.from(Array(fSL), () => Array(sSL).fill(-1));

  return CheckForMatch(fSL - 1, sSL - 1) ? 1 : 0;
  function CheckForMatch(fSL, sSL) {
    if (fSL < 0 && sSL < 0) return true;
    else if (fSL < 0) {
      for (let i = 0; i <= sSL; i++) {
        if (B[i] != "*") return false;
      }
      return true;
    } else if (sSL < 0) return false;

    if (stringArray[fSL][sSL] != -1) return stringArray[fSL][sSL];
    if (A[fSL] == B[sSL] || B[sSL] == "?") {
      stringArray[fSL][sSL] = CheckForMatch(fSL - 1, sSL - 1);
    } else if (B[sSL] == "*") {
      stringArray[fSL][sSL] =
        CheckForMatch(fSL, sSL - 1) || CheckForMatch(fSL - 1, sSL);
    } else stringArray[fSL][sSL] = false;

    return stringArray[fSL][sSL];
  }
}

A = "bcaccbabaa";
B = "bb*c?c*?";

console.log(RegularExpressionMatch(A, B));

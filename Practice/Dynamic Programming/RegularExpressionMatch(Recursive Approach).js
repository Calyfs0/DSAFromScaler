function RegularExpressionMatch(A, B) {
  let fSL = A.length;
  let sSL = B.length;

  let stringHM = new Map();

  return CheckForMatch(fSL - 1, sSL - 1) ? 1 : 0;
  function CheckForMatch(fSL, sSL) {
    if (fSL < 0 && sSL < 0) return true;
    else if (fSL < 0) {
      for (let i = 0; i <= sSL; i++) {
        if (B[i] != "*") return false;
      }
      return true;
    } else if (sSL < 0) return false;

    if (stringHM.has(fSL + "" + sSL)) return stringHM.get(fSL + "" + sSL);
    if (A[fSL] == B[sSL] || B[sSL] == "?") {
      stringHM.set(fSL + "" + sSL, CheckForMatch(fSL - 1, sSL - 1));
    } else if (B[sSL] == "*") {
      stringHM.set(
        fSL + "" + sSL,
        CheckForMatch(fSL, sSL - 1) || CheckForMatch(fSL - 1, sSL)
      );
    } else stringHM.set(fSL + "" + sSL, false);

    return stringHM.get(fSL + "" + sSL);
  }
}

A = "bcaccbabaa";
B = "bb*c?c*?";

console.log(RegularExpressionMatch(A, B));

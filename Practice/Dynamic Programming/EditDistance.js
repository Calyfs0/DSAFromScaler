function EditDistance(A, B) {
  if (A.length == 1 && B.length == 1) {
    if (A[0] == B[0]) return 0;
    return 1;
  }
  if (A.length == 0 && B.length == 0) return 0;
  let fSL = A.length;
  let sSL = B.length;

  let costArray = Array.from(Array(fSL), () => Array(sSL).fill(0));
  let ans = CalculateSteps(fSL - 1, sSL - 1);
  return ans;
  function CalculateSteps(fSL, sSL) {
    if (fSL < 0 && sSL < 0) return 0;
    else if (sSL < 0) {
      return fSL + 1;
    } else if (fSL < 0) {
      return sSL + 1;
    }
    if (costArray[fSL][sSL] != 0) return costArray[fSL][sSL];
    if (A[fSL] == B[sSL]) {
      costArray[fSL][sSL] = CalculateSteps(fSL - 1, sSL - 1);
    } else {
      costArray[fSL][sSL] = Math.min(
        1 + CalculateSteps(fSL, sSL - 1),
        1 + CalculateSteps(fSL - 1, sSL),
        1 + CalculateSteps(fSL - 1, sSL - 1)
      );
    }

    return costArray[fSL][sSL];
  }
}

A = "b";
B = "bab";

console.log(EditDistance(A, B));

A = "3030300";

function divisibilityTest(A) {
  if (A.charAt(A.length - 1) != "0") return 0;
  let s = A.substring(0, A.length - 1);
  let sum = 0;
  for (let i = 0; i < s.length; i++) {
    sum += Number(A.charAt(i));
  }

  if (sum % 3 == 0) return 1;
  return 0;
}

console.log(divisibilityTest(A));

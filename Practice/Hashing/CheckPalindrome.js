A =
  'mnxljrajwhxiaquajokwvoqqphylxpbanmmhfxsmssxzsdnprtgibuhaxnwxzfozexiascybplaaqjcthuydnoowmkzyamodzknkqmwdglqqnhflfslqyowcangsddhcjjuiyfbdkevlghbictrvnmnathotrekyrggwcmbzorqtyeowksywlbetsyhjvczcnvusfdrxythrhhoxtuuprqftgwohcgpngktkharijsovuknae';

function CheckPalindrome(A) {
  let hm = new Map();

  for (let i = 0; i < A.length; i++) {
    hm.set(A[i], hm.has(A[i]) ? hm.get(A[i]) + 1 : 1);
  }
  let numberOfOneValueKeys = 0;
  if (A.length % 2 == 0) {
    for (const [key, value] of hm.entries()) {
      if (value % 2 != 0) return 0;
    }
  } else {
    for (const [key, value] of hm.entries()) {
      if (value % 2 != 0) numberOfOneValueKeys++;
      if (numberOfOneValueKeys > 1) return 0;
    }
  }

  return 1;
}

console.log(CheckPalindrome(A));

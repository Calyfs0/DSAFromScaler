A = 231;

function ColorFulNumber(A) {
  let stringValue = String(A);
  let hs = new Set();
  for (let i = 0; i < stringValue.length; i++) {
    let product = stringValue[i];
    for (let j = i; j < stringValue.length; j++) {
      if (j == i) {
        if (hs.has(stringValue[i])) return 0;
        else hs.add(stringValue[i]);
      } else {
        product = product * stringValue[j];
        if (hs.has(String(product))) return 0;
        else hs.add(String(product));
      }
    }
  }
  return 1;
}

console.log(ColorFulNumber(A));

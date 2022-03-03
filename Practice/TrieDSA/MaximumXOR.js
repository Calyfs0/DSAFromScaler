class BinaryTrie {
  constructor(val) {
    this.data = val;
    this.children = [];
    this.Number = null;
  }

  insertNumberInBinaryForm(root, binaryForm, number) {
    let curr = root;
    for (const ch of binaryForm) {
      if (curr.children[ch] == null) {
        curr.children[ch] = new BinaryTrie(ch);
      }

      curr = curr.children[ch];
    }

    curr.Number = number;
  }

  CalculateXOR(root, binaryForm) {
    let curr = root;
    let xorValue = "";
    for (const ch of binaryForm) {
      if (ch == "0") {
        if (curr.children["1"] != null) {
          xorValue += "1";
          curr = curr.children["1"];
        } else {
          xorValue += "0";
          curr = curr.children["0"];
        }
      } else {
        if (curr.children["0"] != null) {
          xorValue += "0";
          curr = curr.children["0"];
        } else {
          xorValue += "1";
          curr = curr.children["1"];
        }
      }
    }

    return curr.Number;
  }
}

function MaximumXOR(A) {
  //Calculate the max value to know the number of bits we need
  let maxValue = Number.MIN_SAFE_INTEGER;
  for (let i = 0; i < A.length; i++) {
    if (A[i] > maxValue) maxValue = A[i];
  }

  let no_of_bits = 0;
  while (maxValue > 0) {
    no_of_bits++;
    maxValue = maxValue >> 1;
  }

  let obj = new BinaryTrie();
  let root = new BinaryTrie("/0");
  let maxXOR = Number.MIN_SAFE_INTEGER;
  let binaryVal = CalculateBinaryValue(A[0], no_of_bits);
  obj.insertNumberInBinaryForm(root, binaryVal, A[0]);
  for (let i = 1; i < A.length; i++) {
    let binaryVal = CalculateBinaryValue(A[i], no_of_bits);
    let xorValue = obj.CalculateXOR(root, binaryVal);
    maxXOR = Math.max(maxXOR, xorValue ^ A[i]);
    obj.insertNumberInBinaryForm(root, binaryVal, A[i]);
  }

  return maxXOR;
}

function CalculateBinaryValue(val, no_of_bits) {
  let binaryString = "";
  while (val > 1) {
    binaryString = (val % 2) + binaryString;
    val = Math.floor(val / 2);
  }

  binaryString = "1" + binaryString;

  while (binaryString.length < no_of_bits) {
    binaryString = "0" + binaryString;
  }
  return binaryString;
}

A = [5, 17, 100, 11];

console.log(MaximumXOR(A));

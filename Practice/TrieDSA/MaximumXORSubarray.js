A = [1, 4, 3];
function MaximumXORSubarray(A) {
  if (A.length == 1) return [1, 1];
  let prefixXOROfA = [A[0]];
  for (let i = 1; i < A.length; i++) {
    prefixXOROfA[i] = prefixXOROfA[i - 1] ^ A[i];
  }

  let obj = new BinaryTrie();
  let root = new BinaryTrie("/0");

  let binaryVal = CalculateBinaryValue(prefixXOROfA[0], 31);
  obj.insertNumberInBinaryForm(root, binaryVal, prefixXOROfA[0], 1);
  let maxXOR = prefixXOROfA[0];
  let output = [1, 1];
  for (let i = 1; i < prefixXOROfA.length; i++) {
    let binaryVal = CalculateBinaryValue(prefixXOROfA[i], 31);
    let xorValueAndIndex = obj.CalculateXOR(root, binaryVal);
    let xor = xorValueAndIndex[0] ^ prefixXOROfA[i];
    if (xor > maxXOR) {
      output = [xorValueAndIndex[1] + 1, i + 1];
      maxXOR = xor;
    }
    if (prefixXOROfA[i] > maxXOR) {
      output = [1, i + 1];
      maxXOR = prefixXOROfA[i];
    }
    if (xor == maxXOR) {
      if (Math.abs(output[1] - output[0]) > Math.abs(xorValueAndIndex[1] - i)) {
        output = [xorValueAndIndex[1] + 1, i + 1];
        maxXOR = xor;
      }
    }

    obj.insertNumberInBinaryForm(root, binaryVal, prefixXOROfA[i], i + 1);
  }

  return output;
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

class BinaryTrie {
  constructor(val) {
    this.data = val;
    this.children = [];
    this.Number = null;
    this.index = null;
  }

  insertNumberInBinaryForm(root, binaryForm, number, index) {
    let curr = root;
    for (const ch of binaryForm) {
      if (curr.children[ch] == null) {
        curr.children[ch] = new BinaryTrie(ch);
      }

      curr = curr.children[ch];
    }

    curr.Number = number;
    curr.index = index;
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

    return [curr.Number, curr.index];
  }
}

console.log(MaximumXORSubarray(A));

class Trie {
  constructor(val) {
    this.data = val;
    this.freq = 0;
    this.children = [];
  }

  insertWord(root, word) {
    let curr = root;
    for (const ch of word) {
      if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] == null) {
        curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] = new Trie(ch);
      }
      curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)].freq++;
      curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
    }
  }

  findNumberOfContactStartingWithPrefix(root, prefix) {
    let curr = root;
    for (const ch of prefix) {
      if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] == null) return 0;
      curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
    }
    return curr.freq;
  }
}

function ContactFinder(A, B) {
  let root = new Trie("/0");
  let obj = new Trie();
  let output = [];
  for (let i = 0; i < A.length; i++) {
    if (A[i] == 0) {
      obj.insertWord(root, B[i]);
    } else {
      output.push(obj.findNumberOfContactStartingWithPrefix(root, B[i]));
    }
  }

  return output;
}

A = [0, 0, 1, 1];
B = ["hack", "hacker", "hac", "hak"];

console.log(ContactFinder(A, B));

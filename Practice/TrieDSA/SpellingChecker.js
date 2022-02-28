A = ["a", "b"];
B = ["a", "c"];

class Trie {
  constructor(val) {
    this.data = val;
    this.isWord = false;
    this.children = [];
  }

  insertWord(root, word) {
    let curr = root;
    for (const w of word) {
      if (curr.children[w.charCodeAt(0) - "a".charCodeAt(0)] == null) {
        curr.children[w.charCodeAt(0) - "a".charCodeAt(0)] = new Trie(w);
      }
      curr = curr.children[w.charCodeAt(0) - "a".charCodeAt(0)];
    }

    curr.isWord = true;
  }

  searchWord(root, word) {
    let curr = root;
    for (const w of word) {
      if (curr.children[w.charCodeAt(0) - "a".charCodeAt(0)] == null)
        return false;
      curr = curr.children[w.charCodeAt(0) - "a".charCodeAt(0)];
    }

    if (curr.isWord) return true;
    return false;
  }
}

function SpellingChecker(A, B) {
  let rootNode = new Trie("/0");
  let output = [];
  let obj = new Trie();
  for (const word of A) {
    obj.insertWord(rootNode, word);
  }

  for (const w of B) {
    let val = obj.searchWord(rootNode, w);
    if (val) output.push(1);
    else output.push(0);
  }
  console.log(output);
}

SpellingChecker(A, B);

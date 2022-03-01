class Trie {
  constructor(val) {
    this.data = val;
    this.isWord = false;
    this.children = [];
  }

  insertWord(root, word) {
    let curr = root;
    for (const ch of word) {
      if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] == null) {
        curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] = new Trie(ch);
      }
      curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
    }
    curr.isWord = true;
  }

  searchWordWithOneModification(root, word) {
    let isModified = 0;
    let curr = root;
    for (const ch of word) {
      if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] == null) {
        if (isModified == 0) {
          isModified++;
          if (word.indexOf(ch) == word.length - 1) return "1";
          else {
            let index = word.indexOf(ch) + 1;
            let isFound = false;
            for (let i = 0; i < curr.children.length; i++) {
              //   if (
              //     child.children[word[index].charCodeAt(0) - "a".charCodeAt(0)] !=
              //     null
              //   ) {
              //     isFound = true;
              //     curr = child;
              //   }
              console.log(curr.children[i]);
            }
            if (!isFound) return "0";
          }
        } else if (isModified == 1) {
          if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] == null)
            return "0";
          curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
        }
      } else {
        curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
      }
    }

    return "1";
  }
}

function ModifiedSearch(A, B) {
  let root = new Trie("/0");
  let output = "";
  let obj = new Trie();
  for (const word of A) {
    obj.insertWord(root, word);
  }

  for (const word of B) {
    output += obj.searchWordWithOneModification(root, word);
  }

  return output;
}

A = ["data", "circle", "cricket"];
B = ["date", "circel", "crikket", "data", "circl"];

console.log(ModifiedSearch(A, B));

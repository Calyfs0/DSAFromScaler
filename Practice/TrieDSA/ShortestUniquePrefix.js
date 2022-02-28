class TrieNode {
  constructor(val) {
    this.data = val;
    this.freq = 0;
    this.children = [];
    this.isWord = false;
  }

  insertWord(root, word) {
    let curr = root;
    for (const ch of word) {
      if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] == null) {
        curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)] = new TrieNode(ch);
      }
      curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)].freq++;
      curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
    }
    curr.isWord = true;
  }

  searchShortestPrefix(root, word) {
    let curr = root;
    let shortest_prefix = "";
    for (const ch of word) {
      if (curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)].freq == 1) {
        shortest_prefix +=
          curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)].data;
        return shortest_prefix;
      }
      shortest_prefix +=
        curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)].data;
      curr = curr.children[ch.charCodeAt(0) - "a".charCodeAt(0)];
    }
  }
}

function ShortestUniquePrefix(A) {
  let root = new TrieNode("/0");
  let output = [];
  let obj = new TrieNode();
  for (const word of A) {
    obj.insertWord(root, word);
  }

  for (const word of A) {
    output.push(obj.searchShortestPrefix(root, word));
  }

  console.log(output);
}

A = ["zebra", "dog", "duck", "dove"];
ShortestUniquePrefix(A);

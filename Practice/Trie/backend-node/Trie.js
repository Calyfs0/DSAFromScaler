class Node {
  constructor(ch) {
    this.ch = ch;
    this.isWord = false;
    this.children = {};
  }
}

class Trie {
  root;
  constructor() {
    this.root = new Node('\0');
  }

  inserString = word => {
    let current_node = this.root;
    for (const char of word) {
      if (
        current_node.children[char.charCodeAt(0) - 'a'.charCodeAt(0)] == null
      ) {
        current_node.children[char.charCodeAt(0) - 'a'.charCodeAt(0)] =
          new Node(char);
      }
      current_node =
        current_node.children[char.charCodeAt(0) - 'a'.charCodeAt(0)];
    }
    current_node.isWord = true;
  };

  getWord = word => {
    let current_node = this.root;

    for (const char of word) {
      console.log(current_node);
      if (current_node.children[char.charCodeAt(0) - 'a'.charCodeAt(0)] == null)
        return null;
      current_node =
        current_node.children[char.charCodeAt(0) - 'a'.charCodeAt(0)];
    }
    return current_node;
  };

  search = word => {
    const n = this.getWord(word);
    return n != null && n.isWord;
  };

  startsWith = prefix => this.getWord(prefix);

  getMatchingWords = word => {
    let current_node = this.root;
    for (const char of word) {
    }
  };
}

module.exports = Trie;

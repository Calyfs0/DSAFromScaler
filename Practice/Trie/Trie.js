




function node(ch){
    this.ch = ch;
    this.isWord = false;
    this.children = {};
    }
    
    
    function trie(){
    
    this.root = new node('\0');
    
    this.inserString = function( word )
    {
      var current_node = this.root;
      for (var i = 0; i < word.length; i++)
      {
          var c = word[i];
    
          if (current_node.children[c.charCodeAt(0) - 'a'.charCodeAt(0)] == null)
          {
              current_node.children[c.charCodeAt(0) - 'a'.charCodeAt(0)] = new node(c);
              current_node = current_node.children[c.charCodeAt(0) - 'a'.charCodeAt(0)];
          }else{
            current_node = current_node.children[c.charCodeAt(0) - 'a'.charCodeAt(0)];
          }
      }
      current_node.isWord = true;
    }
    
    this.getWord = function (word){
      var current_node = this.root;
      for (var i = 0; i < word.length; i++)
      {
          var c = word[i];
          if (current_node.children[c.charCodeAt(0) - 'a'.charCodeAt(0)] == null) return null;
          current_node = current_node.children[c.charCodeAt(0) - 'a'.charCodeAt(0)];
      }
    
      return current_node;
    }
    
    this.search = function(word)
    {
        var node = this.getWord(word);
        return (node != null && node.isWord);
    }
    
    this.startsWith = function(prefix)
    {
        return this.getWord(prefix)!=null;
    }
    
    }
    
    function main() {
      var t = trie();
      var input = 1;
      switch (input)
      {
          case 1:
              {
                  console.log("Enter a value to insert?");
                  var value = 'kishore';
                  trie().insertString(value);
                  break;
              }
          case 2:
              {
                  console.log("Enter a value to search?");
                  value = 'kishore';
                  var isFind = trie().search(value);
                  console.log(isFind ? "String Found" : "String is not present");
                  break;
              }
          case 3:
              {
                 console.log("Enter a prefix to search ?");
                  var value = 'ki';
                  var isPrefix = trie().StartsWith(value);
                  console.log(isPrefix ? "Prefix Found" : "Prefix not present");
                  break;
              }
          default:
              {
                console.log("Cya later");
                break;
              }
      }
    }
    
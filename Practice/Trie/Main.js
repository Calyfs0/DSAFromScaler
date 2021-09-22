class Trie{
   
    constructor()
    {
       this.root = new Node('\0')
    }
 
    insert(word) {
          var current_node = this.root
 
          for(var i=0;i<word.length;i++){
             var c = word.charAt(i)
              if(current_node.children[c - 'a']==null){
                 current_node.children[c - 'a'] = new Node(c)
              }
              current_node = current_node.children[c - 'a']
          }
           current_node.isWord = true
    }

    getWord(word){
        var current_node = this.root
        for(var i=0;i<word.length;i++){
            var c = word.charAt(i)
            if(current_node.children[c - 'a']==null){
                return null 
            }
            current_node = current_node.children[c - 'a']
        }

        console.log(current_node) 
        
    }
 
 }

 class Node{

    constructor(ch){
        this.c = ch
        this.isWord = false
        this.children = []
    }

    


}

t = new Trie()

t.insert("sagar")
console.log(t.getWord("sagar"))

// Definition for singly-linked list.
//    function Node(data){
//      this.data = data
//      this.next = null
//    }

module.exports = {
  //param A : head node of linked list
  //return the head node in the linked list
  reverseList: function (A) {
    let prev = null;
    let currNode = A;
    while (currNode != null) {
      let nextNode = currNode.next;
      currNode.next = prev;
      prev = currNode;
      currNode = nextNode;
    }

    return prev;
  },
};

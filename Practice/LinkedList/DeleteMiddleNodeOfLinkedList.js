// Definition for singly-linked list.
//    function Node(data){
//      this.data = data
//      this.next = null
//    }

module.exports = {
  //param A : head node of linked list
  //return the head node in the linked list
  solve: function (A) {
    let llist_length = 0;
    let currentNode = A;
    while (currentNode != null) {
      llist_length++;
      currentNode = currentNode.next;
    }
    if (llist_length == 1) {
      A = null;
      return A;
    }
    let pos_to_del = Math.floor(llist_length / 2);

    currentNode = A;
    let count = 1;
    while (count < pos_to_del) {
      currentNode = currentNode.next;
      count++;
    }
    let temp = currentNode.next;
    currentNode.next = temp.next;
    return A;
  },
};

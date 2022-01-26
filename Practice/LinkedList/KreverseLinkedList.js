// Definition for singly-linked list.
//    function Node(data){
//      this.data = data
//      this.next = null
//    }

module.exports = {
  //param A : head node of linked list
  //param B : integer
  //return the head node in the linked list
  reverseList: function (A, B) {
    return reverseLList(A, B);
  },
};

function reverseLList(A, B) {
  if (A == null) return null;
  let prevNode = null;
  let currentNode = A;
  let count = B;

  while (count > 0 && currentNode != null) {
    let nextNode = currentNode.next;
    currentNode.next = prevNode;
    prevNode = currentNode;
    currentNode = nextNode;
    count--;
  }
  A.next = reverseLList(currentNode, B);
  return prevNode;
}

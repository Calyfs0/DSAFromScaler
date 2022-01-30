class Node {
  constructor() {
    this.data = null;
    this.next = null;
  }
}
let head = null;
class LinkedList {
  constructor() {
    this.head = null;
  }

  insert_node(val) {
    let newNode = new Node();
    newNode.data = val;
    newNode.next = null;
    if (head == null) {
      head = newNode;
    } else {
      let currNode = head;
      while (currNode.next != null) {
        currNode = currNode.next;
      }
      currNode.next = newNode;
    }
  }
}
let A = [1, 2, 3];
for (let i = 0; i < A.length; i++) {
  let ll = new LinkedList();
  ll.insert_node(A[i]);
}

let cNode = head;
while (cNode != null) {
  console.log(cNode.data);
  cNode = cNode.next;
}

console.log(Reverse(head, 1, 5));
function Reverse(A, B, C) {
  if (B == C) return A;
  let curr = A;
  let count = 1;
  while (count < B - 1) {
    curr = curr.next;
    count++;
  }
  let start = null;
  let rev_curr = null;
  if (B == 1) {
    start = curr;
    rev_curr = curr;
  } else {
    start = curr.next;
    rev_curr = curr.next;
  }

  let prev = null;
  let next = null;
  let x = C - B;
  while (x >= 0 && rev_curr.next != null) {
    x--;
    next = rev_curr.next;
    rev_curr.next = prev;
    prev = rev_curr;
    rev_curr = next;
  }

  start.next = next;
  curr.next = prev;

  return A;
}

/**
 * Node for Linked List
 * data refers to the value of the node
 * next refers to the next node it points to
 * by default both are null
 */
class Node {
  constructor() {
    this.data = null;
    this.next = null;
    this.random = null;
  }
}
/**
 * Creating LinkedList with just insert method for testing
 * head refers to head of the node
 * insert_node takes a int value and creates a new node, appends it to the next available position
 */

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
      newNode.random = head;
    }
  }
}

/**
 * Filling the LinkedList
 */
let A = [1, 2, 3];

for (let i = 0; i < A.length; i++) {
  let ll = new LinkedList();
  ll.insert_node(A[i]);
}

/**
 * Printing the LinkedList
 */
function printLinkedList(head) {
  let cNode = head;
  let output = "";
  while (cNode != null) {
    output += cNode.data + " => ";
    // console.log(
    //   `Data: ${cNode.data}, NextNode: ${
    //     cNode.next == null ? null : cNode.next.data
    //   }`
    // );
    // console.log(`${cNode.data} =>`);
    cNode = cNode.next;
  }
  output += "null";
  console.log(output);
}
printLinkedList(head);
/**
 * Testing a function based on the above created input
 */

printLinkedList(TestFunction(head));
function TestFunction(head) {
  let curr = head;
  while (curr != null) {
    let newNode = new Node();
    newNode.data = curr.data;
    newNode.next = curr.next;
    curr.next = newNode;
    curr = newNode.next;
  }
  curr = head;
  head2 = curr.next;
  curr2 = head2;

  while (curr != null && curr2 != null) {
    if (curr.random != null) {
      curr2.random = curr.random.next;
    }
    curr = curr2.next;
    if (curr != null) {
      curr2 = curr.next;
    }
  }

  curr = head;
  curr2 = head2;

  while (curr != null && curr2 != null) {
    curr.next = curr2.next;
    curr = curr.next;
    if (curr != null && curr.next != null) {
      curr2.next = curr.next;
      curr2 = curr2.next;
    }
  }

  return head2;
}

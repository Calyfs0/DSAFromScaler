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
    }
  }
}

/**
 * Filling the LinkedList
 */
let A = [1, 2, 3, 4, 5];
for (let i = 0; i < A.length; i++) {
  let ll = new LinkedList();
  ll.insert_node(A[i]);
}

/**
 * Printing the LinkedList
 */
function printLinkedList() {
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
printLinkedList();
/**
 * Testing a function based on the above created input
 */

TestFunction(head);
printLinkedList();
function TestFunction(A) {
  if (A == null || A.next == null) return A;
  let slow_pointer = A;
  let fast_pointer = A;
  while (fast_pointer.next != null && fast_pointer.next.next != null) {
    slow_pointer = slow_pointer.next;
    fast_pointer = fast_pointer.next.next;
  }

  let second_list_head = slow_pointer.next;
  slow_pointer.next = null;
  let first_list_head = A;

  second_list_head = reverseLinkedList(second_list_head);
  while (second_list_head != null) {
    let second_list_nextNode = second_list_head.next;
    second_list_head.next = first_list_head.next;
    first_list_head.next = second_list_head;
    first_list_head = second_list_head.next;
    second_list_head = second_list_nextNode;
  }

  return A;
}

function reverseLinkedList(A) {
  let prev = null;
  let curr = A;

  while (curr != null) {
    let nextNode = curr.next;
    curr.next = prev;
    prev = curr;
    curr = nextNode;
  }
  return prev;
}

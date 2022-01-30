function ReorderList(A) {
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

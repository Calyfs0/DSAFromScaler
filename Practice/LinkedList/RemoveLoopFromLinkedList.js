function RemoveLoopFromLinkedList(A) {
  if (A == null || A.next == null) return null;
  let slow_pointer = A;
  let fast_pointer = A;
  while (fast_pointer.next != null && fast_pointer.next.next != null) {
    slow_pointer = slow_pointer.next;
    fast_pointer = fast_pointer.next.next;
    if (slow_pointer == fast_pointer) {
      slow_pointer = A;
      let prev = null;
      while (slow_pointer != fast_pointer) {
        slow_pointer = slow_pointer.next;
        prev = fast_pointer;
        fast_pointer = fast_pointer.next;
      }
      prev.next = null;
      return A;
    }
  }

  return A;
}

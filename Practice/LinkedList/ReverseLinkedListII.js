function Reverse(A, B, C) {
  if (A == null || B == C) return A;
  let nodeBeforeStart = A;
  let startNode = null;
  let swappingNode = null;

  if (B != 1) {
    let count = 1;
    while (count < B - 1) {
      nodeBeforeStart = nodeBeforeStart.next;
      count++;
    }
    startNode = nodeBeforeStart.next;
  } else {
    startNode = A;
    nodeBeforeStart = null;
  }
  let count = B;
  while (count < C) {
    swappingNode = startNode.next;
    startNode.next = swappingNode.next;
    if (B == 1) {
      swappingNode.next = A;
      A = swappingNode;
      // head = A;
    } else {
      swappingNode.next = nodeBeforeStart.next;
      nodeBeforeStart.next = swappingNode;
    }

    count++;
    // printLinkedList();
  }
  return A;
}

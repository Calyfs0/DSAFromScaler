let DeepCopyList = (head) => {
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
};

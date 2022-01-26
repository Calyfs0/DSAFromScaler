// YOUR CODE GOES HERE
// Please take input and print output to standard input/output (stdin/stdout)
// DO NOT USE ARGUMENTS FOR INPUTS

let head = new Node();
let size = 0;
class LinkedList {
  constructor() {
    head = null;
    size = 0;
  }

  insert_node(pos, no) {
    let newNode = new Node(0);
    newNode.data = no;
    if (pos == 1) {
      newNode.next = head;
      head = newNode;
    } else {
      let count = 1;
      let curr = head;
      while (curr != null && count < pos - 1) {
        curr = curr.next;
        count++;
      }

      newNode.next = curr.next;
      curr.next = newNode;
    }
    size++;
  }

  delete_node(pos) {
    if (pos >= 1 && pos <= size) {
      if (pos == 1) {
        head = head.next;
      } else {
        let count = 1;
        let curr = head;
        while (curr != null && count < pos - 1) {
          curr = curr.next;
          count++;
        }

        curr.next = curr.next.next;
      }
      size--;
    }
  }

  print_ll() {
    let temp = head;
    let flag = 0;
    while (temp != null) {
      if (flag == 0) {
        process.stdout.write(temp.data);
        flag = 1;
      } else process.stdout.write(" " + temp.data);
      temp = temp.next;
    }
    process.stdout.write("\n");
  }
}

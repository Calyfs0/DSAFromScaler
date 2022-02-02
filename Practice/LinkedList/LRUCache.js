class Node {
  constructor(key, value) {
    this.data = value;
    this.key = key;
    this.next = null;
    this.prev = null;
  }
}

// Constructor : Initializes the LRUCache with capacity
module.exports = {
  LRUCache: function (capacity) {
    let limit = capacity;
    let size = 0;
    let head = null;
    let tail = null;
    let hm = new Map();

    return {
      // get function returns an integer
      get: function (key) {
        if (hm.has(key)) {
          let node = hm.get(key);
          this.set(key, node.data);
          return node.data;
        }
        return -1;
      },
      // set returns nothing
      set: function (key, value) {
        let checkExistingKey = hm.get(key);

        if (checkExistingKey) {
          hm.delete(key);
          if (checkExistingKey.prev != null) {
            checkExistingKey.prev.next = checkExistingKey.next;
          } else {
            head = checkExistingKey.next;
          }
          if (checkExistingKey.next != null) {
            checkExistingKey.next.prev = checkExistingKey.prev;
          } else {
            tail = checkExistingKey.prev;
          }

          size--;
        } else if (size == limit) {
          hm.delete(tail.key);
          if (tail.prev != null) {
            tail.prev.next = tail.next;
          } else {
            head = tail.next;
          }
          if (tail.next != null) {
            tail.next.prev = tail.prev;
          } else {
            tail = tail.prev;
          }

          size--;
        }

        let newNode = new Node();
        newNode.data = value;
        newNode.key = key;
        if (head == null) {
          head = tail = newNode;
        } else {
          newNode.next = head;
          head.prev = newNode;
          head = newNode;
        }
        hm.set(key, head);
        size++;
      },
    };
  },
};

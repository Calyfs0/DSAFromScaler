function PathInDirectedGraph(A, B) {
  let sourceNode = 1;
  let hs = new Set();
  let queue = [];
  queue.push(sourceNode);
  hs.add(sourceNode);

  let hm = {};

  for (let i = 1; i <= A; i++) {
    hm[i] = [];
  }

  for (let i = 0; i < B.length; i++) {
    let valArray = hm[B[i][0]];
    valArray.push(B[i][1]);
    hm[B[i][0]] = valArray;
  }

  while (queue.length > 0) {
    let currNode = queue.shift();
    for (let i = 0; i < hm[currNode].length; i++) {
      if (hs.has(hm[currNode][i])) continue;
      let val = hm[currNode][i];
      queue.push(val);
      hs.add(val);
    }
  }

  if (hs.has(A)) return 1;
  return 0;
}

A = 5;
B = [
  [1, 2],
  [4, 1],
  [2, 4],
  [3, 4],
  [5, 2],
  [1, 3],
];

console.log(PathInDirectedGraph(A, B));

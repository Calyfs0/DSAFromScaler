function FirstDepthFirstSearch(A, B, C) {
  let graphPaths = {};
  for (let i = 0; i < A.length; i++) {
    if (graphPaths[A[i]] == undefined) {
      graphPaths[A[i]] = [i + 1];
    } else {
      let arr = graphPaths[A[i]];
      arr.push(i + 1);
      graphPaths[A[i]] = arr;
    }
  }
  visitedArray = new Set();
  DFS(graphPaths, C);
  if (visitedArray.has(B)) return 1;
  return 0;
  function DFS(graphPaths, source) {
    visitedArray.add(source);
    if (graphPaths[source] != undefined) {
      for (let i = 0; i < graphPaths[source].length; i++) {
        if (!visitedArray.has(graphPaths[source][i])) {
          DFS(graphPaths, graphPaths[source][i]);
        }
      }
    }
  }
}

A = [1, 1, 2];
B = 1;
C = 2;

console.log(FirstDepthFirstSearch(A, B, C));

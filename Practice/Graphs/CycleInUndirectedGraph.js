function CycleInUndirectedGraph(A, B) {
  //Step 1. Map each node to it's connected nodes
  let graphEdgesMap = {};
  CreateGraphEdgesMap();
  let ans = 0;
  let visitedArray = Array(A + 1).fill(-1);
  for (let i = 1; i <= A; i++) {
    if (visitedArray[i] == -1) {
      if (bfs(i)) return 1;
    }
  }
  return 0;

  function bfs(node) {
    let queue = [];
    queue.push(node);
    visitedArray[node] = 0;
    while (queue.length > 0) {
      let curr = queue.shift();
      visitedArray[curr] = 1;
      if (graphEdgesMap[curr] != undefined) {
        for (let i = 0; i < graphEdgesMap[curr].length; i++) {
          if (visitedArray[graphEdgesMap[curr][i]] == -1) {
            visitedArray[graphEdgesMap[curr][i]] = 0;
            queue.push(graphEdgesMap[curr][i]);
          } else if (visitedArray[graphEdgesMap[curr][i]] == 0) {
            return 1;
          }
        }
      }
    }
  }

  //Mapping each nodes to it's connected nodes
  //As it's an undirected graph, A--B === B--A
  function CreateGraphEdgesMap() {
    for (let BIndex = 0; BIndex < B.length; BIndex++) {
      let firstValue = B[BIndex][0];
      let secondValue = B[BIndex][1];

      if (graphEdgesMap[firstValue] == undefined) {
        graphEdgesMap[firstValue] = [secondValue];
      } else {
        let edgesArray = graphEdgesMap[firstValue];
        edgesArray.push(secondValue);
        graphEdgesMap[firstValue] = edgesArray;
      }

      if (graphEdgesMap[secondValue] == undefined) {
        graphEdgesMap[secondValue] = [firstValue];
      } else {
        let edgesArray = graphEdgesMap[secondValue];
        edgesArray.push(firstValue);
        graphEdgesMap[secondValue] = edgesArray;
      }
    }
  }
}

A = 4;
B = [
  [1, 2],
  [2, 3],
  [3, 4],
];

console.log(CycleInUndirectedGraph(A, B));

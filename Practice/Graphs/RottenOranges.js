function RottenOranges(A) {
  let queue = [];
  let totalOranges = 0;
  //find all rotten oranges in the matrix and add them to queue
  //find totalOranges (including rotten oranges)
  for (let row = 0; row < A.length; row++) {
    for (let col = 0; col < A[0].length; col++) {
      if (A[row][col] == 2) {
        totalOranges++;
        queue.push([row, col, 0]);
      } else if (A[row][col] == 1) totalOranges++;
    }
  }

  //up,down,left,right values
  let dx = [0, 0, -1, 1];
  let dy = [-1, 1, 0, 0];
  let totalRottenOranges = queue.length;
  let timeStamp = 0;
  let currentIndex = 0;
  //performing bfs
  while (queue.length != currentIndex) {
    let currIndices = queue[currentIndex];
    for (let index = 0; index < dx.length; index++) {
      let newRow = currIndices[0] + dx[index];
      let newCol = currIndices[1] + dy[index];
      timeStamp = currIndices[2];
      if (
        newRow >= 0 &&
        newCol >= 0 &&
        newRow < A.length &&
        newCol < A[0].length &&
        A[newRow][newCol] == 1
      ) {
        A[newRow][newCol] = 2;
        queue.push([newRow, newCol, timeStamp + 1]);
        totalRottenOranges++;
      }
    }
    currentIndex++;
  }

  if (totalRottenOranges < totalOranges) return -1;
  return timeStamp;
}

A = [
  [2, 1, 1],
  [0, 1, 1],
  [1, 0, 1],
];

console.log(RottenOranges(A));

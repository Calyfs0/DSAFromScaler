function NumberOfIslands(A) {
  let count = 0;
  let rowLength = A.length;
  let colLength = A[0].length;
  let dx = [-1, 0, 1, 0, -1, 1, -1, 1];
  let dy = [0, -1, 0, 1, -1, 1, 1, -1];
  //   let dx = [-1, 0, 1, 0, -1, 1, -1, 1];
  //   let dy = [0, -1, 0, 1, -1, 1, 1, -1];

  for (let i = 0; i < rowLength; i++) {
    for (let j = 0; j < colLength; j++) {
      if (A[i][j] == 1) {
        count++;
        dfs(A, i, j);
      }
    }
  }

  return count;
  function dfs(A, row, col) {
    A[row][col] = 0;

    for (let u = 0; u < dx.length; u++) {
      let x = row + dx[u];
      let y = col + dy[u];
      if (x >= 0 && y >= 0 && x < rowLength && y < colLength && A[x][y] == 1) {
        dfs(A, x, y);
      }
    }
  }
}

A = [
  [1, 1, 0, 0, 0],
  [0, 1, 0, 0, 0],
  [1, 0, 0, 1, 1],
  [0, 0, 0, 0, 0],
  [1, 0, 1, 0, 1],
];

// A = [
//   [0, 0, 1, 0, 1, 0, 1, 1, 1],
//   [0, 1, 0, 0, 1, 1, 1, 0, 1],
// ];

console.log(NumberOfIslands(A));

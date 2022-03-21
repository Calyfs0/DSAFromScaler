function UniquePathsInAGrid(A) {
  let l = A.length;

  let pathGrid = Array.from(Array(l), () => Array(A[0].length).fill(0));

  FindPath(A.length - 1, A[0].length - 1);
  return pathGrid[l - 1][A[0].length - 1];
  function FindPath(i, j) {
    if (i == 0 && j == 0) {
      if (A[i][j] != 1) pathGrid[i][j] = 1;
      return pathGrid[i][j];
    }

    if (i == 0 && j > 0) {
      pathGrid[i][j] = A[i][j] != 1 ? FindPath(i, j - 1) : 0;
      return pathGrid[i][j];
    }

    if (i > 0 && j == 0) {
      pathGrid[i][j] = A[i][j] != 1 ? FindPath(i - 1, j) : 0;
      return pathGrid[i][j];
    }

    if (pathGrid[i][j] != 0) return pathGrid[i][j];

    if (A[i][j] != 1) {
      pathGrid[i][j] = FindPath(i - 1, j) + FindPath(i, j - 1);
    }

    return pathGrid[i][j];
  }
}
A = [
  [1, 0],
  [1, 0],
  [1, 0],
  [1, 0],
  [1, 1],
];
console.log(UniquePathsInAGrid(A));

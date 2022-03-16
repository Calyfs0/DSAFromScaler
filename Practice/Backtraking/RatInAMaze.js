function RatInAMaze(A) {
  let path = []; //A 2d matrix
  for (let i = 0; i < A.length; i++) {
    let input = [];
    for (let j = 0; j < A.length; j++) {
      input.push(0);
    }
    path.push(input);
  }
  let finalPath = [];
  findPath(0, 0, A, A.length, A.length);
  return finalPath;
  function findPath(i, j, A, n, m) {
    if (i == n - 1 && j == n - 1) {
      path[n - 1][n - 1] = 1;
      for (let i = 0; i < A.length; i++) {
        let input = [];
        for (let j = 0; j < A.length; j++) {
          input.push(path[i][j]);
        }
        finalPath.push(input);
      }
      return;
    }

    if (i < 0 || i >= n || j < 0 || j >= n || A[i][j] == 0 || A[i][j] == 2)
      return;

    A[i][j] = 2;
    path[i][j] = 1;
    findPath(i + 1, j, A, n, m);
    findPath(i - 1, j, A, n, m);
    findPath(i, j + 1, A, n, m);
    findPath(i, j - 1, A, n, m);
    path[i][j] = 0;
  }
}

A = [
  [1, 1, 1],
  [1, 0, 1],
  [0, 0, 1],
];

console.log(RatInAMaze(A));

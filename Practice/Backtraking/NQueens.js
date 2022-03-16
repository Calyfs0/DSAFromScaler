function NQueens(A) {
  let columnArray = Array(A).fill(0);
  let RightDiagonalArray = Array(2 * A - 1).fill(0);
  let LeftDiagonalArray = Array(2 * A - 1).fill(0);
  let finalPath = [];
  let currentPath = Array.from(Array(A), () => new Array(A).fill(0));
  findPath(0);

  return finalPath.sort();
  function findPath(index) {
    if (index == A) {
      let output = [];
      for (let i = 0; i < A; i++) {
        let outputString = "";
        for (let j = 0; j < A; j++) {
          if (currentPath[i][j]) {
            outputString += "Q";
          } else outputString += ".";
        }
        output.push(outputString);
      }
      finalPath.push(output);
      return;
    }

    for (let col = 0; col < A; col++) {
      if (
        columnArray[col] == 1 ||
        RightDiagonalArray[A + index - col] == 1 ||
        LeftDiagonalArray[index + col] == 1
      )
        continue;
      currentPath[index][col] = 1;
      columnArray[col] = 1;
      RightDiagonalArray[A + index - col] = 1;
      LeftDiagonalArray[index + col] = 1;
      findPath(index + 1);
      currentPath[index][col] = 0;
      columnArray[col] = 0;
      RightDiagonalArray[A + index - col] = 0;
      LeftDiagonalArray[index + col] = 0;
    }
  }
}

A = 4;
console.log(NQueens(A));

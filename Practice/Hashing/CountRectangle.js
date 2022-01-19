function CountRectangles(A, B) {
  const hs = new Set();

  for (let i = 0; i < A.length; i++) {
    hs.add(`${A[i]}_${B[i]}`);
  }
  const arr = Array.from(hs);
  let ans = 0;
  for (let i = 0; i < arr.length - 1; i++) {
    let x1 = arr[i].substring(0, arr[i].indexOf(`_`));
    let y1 = arr[i].substring(arr[i].indexOf(`_`) + 1);
    for (let j = i + 1; j < arr.length; j++) {
      let x2 = arr[j].substring(0, arr[j].indexOf(`_`));
      let y2 = arr[j].substring(arr[j].indexOf(`_`) + 1);

      if (x1 == x2 || y1 == y2) continue;
      let coordinateOne = `${x1}_${y2}`;
      let coordinateTwo = `${x2}_${y1}`;

      if (hs.has(coordinateOne) && hs.has(coordinateTwo)) {
        ans++;
      }
    }
    hs.delete(`${x1}_${y1}`);
  }

  return ans;
}
A = [9, 5, 1, 1, 3, 7, 7, 9, 6, 9, 2, 8];
B = [8, 1, 5, 3, 8, 5, 4, 5, 2, 2, 7, 9];

console.log(CountRectangles(A, B));

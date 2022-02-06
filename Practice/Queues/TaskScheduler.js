function TaskScheduler(A, B) {
  let tasks = 0;
  let l = 0;
  let n = A.length;
  for (let i = 0; i < B.length; i++) {
    let current_task = B[i];
    while (A[l] != current_task) {
      if (A[l] != 0) {
        tasks++;
      }
      l = (l + 1) % n;
    }
    A[l] = 0;
    l = (l + 1) % n;
    tasks++;
  }

  return tasks;
}
A = [2, 3, 1, 5, 4];
B = [1, 3, 5, 4, 2];

console.log(TaskScheduler(A, B));

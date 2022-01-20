function ReplicateSubstring(A, B) {
  const hm = new Map();

  for (let i = 0; i < B.length; i++) {
    hm.set(B[i], hm.has(B[i]) ? hm.get(B[i]) + 1 : 1);
  }

  for (const [key, value] of hm.entries()) {
    if (value % A != 0) return -1;
  }

  return 1;
}

A = 2;
B = 'bbaabb';

console.log(ReplicateSubstring(A, B));

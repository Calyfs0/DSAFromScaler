function DistinctPrime(A) {
  let max = A[0];

  for (let i = 1; i < A.length; i++) {
    if (A[i] > max) max = A[i];
  }

  let prime_arr = [];

  for (let i = 0; i <= max; i++) {
    prime_arr.push(1);
  }

  for (let i = 2; i < prime_arr.length; i++) {
    if (prime_arr[i] == 1) {
      for (let j = i * i; j < prime_arr.length; j += i) {
        prime_arr[j]++;
      }
    }
  }

  let all_prime = [];

  for (let i = 2; i < prime_arr.length; i++) {
    if (prime_arr[i] == 1) all_prime.push(i);
  }

  let hs = new Set();
  for (let i = 0; i < all_prime.length; i++) {
    for (let j = 0; j < A.length; j++) {
      if (A[j] % all_prime[i] == 0) hs.add(all_prime[i]);
    }
  }

  return hs.size;
}

A = [
  50, 25, 2, 97, 89, 13, 47, 63, 40, 9, 82, 90, 51, 96, 43, 53, 5, 13, 15, 31,
  52, 59, 65, 43, 62, 74, 46, 78, 7, 61,
];

console.log(DistinctPrime(A));

function DistinctPrime2(A) {
  let m = new Set();

  // Iterate over every element of array
  for (let i = 0; i < A.length; i++) {
    let sq = Math.floor(Math.sqrt(A[i]));

    // From 2 to square root of number
    // run a loop and check the numbers
    // which are factors.
    for (let j = 2; j <= sq; j++) {
      if (A[i] % j == 0) {
        // If j is a factor store
        // it in the set
        m.add(j);

        // Divide the number with j
        // till it is divisible so
        // that only prime factors
        // are stored
        while (A[i] % j == 0) {
          A[i] = Math.floor(A[i] / j);
        }
      }
    }

    // If the number is still greater
    // than 1 then it is a prime factor,
    // insert in set
    if (A[i] > 1) {
      m.add(A[i]);
    }
  }

  // The number of unique prime
  // factors will the size of the set
  return m.size;
}

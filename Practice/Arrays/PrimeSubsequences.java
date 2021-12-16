public class PrimeSubsequences {
    public int solve(int[] A) {
        int count = 0;
        int mod = 1000000007;
        int num = 1;
        for (int i = 0; i < A.length; i++) {
            if (isPrime(A[i])) {
                count = count % mod + num % mod;
                count = count % mod;
                num = num % mod + num % mod;
                num = num % mod;
            }
        }
        return count;

    }

    public boolean isPrime(int N) {
        if (N < 2)
            return false;
        for (int j = 2; j * j <= N; j++) {
            if (N % j == 0)
                return false;
        }
        return true;
    }
}

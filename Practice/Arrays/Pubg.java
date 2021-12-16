public class Pubg {
    public int solve(int[] A) {
        if (A.length == 1)
            return A[0];

        int min_health = GCD(Math.min(A[0], A[1]), Math.max(A[0], A[1]));

        for (int i = 2; i < A.length; i++) {
            min_health = GCD(Math.min(A[i], min_health), Math.max(A[i], min_health));
        }

        return min_health;
    }

    public int GCD(int A, int B) {
        if (B == 0)
            return A;
        return GCD(B, A % B);
    }
}
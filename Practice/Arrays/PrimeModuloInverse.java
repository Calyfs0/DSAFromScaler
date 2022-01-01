public class PrimeModuloInverse {
    public int solve(int A, int B) {
        return PowerFunction(A, B - 2, B);
    }

    public int PowerFunction(int A, int B, int M) {
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        long val = PowerFunction(A, B / 2, M);

        if (B % 2 == 0) {
            long curr_val = (val % M * val % M) % M;
            if (curr_val < 0) {
                curr_val += M;
            }
            return (int) curr_val;
        } else {
            long curr_val = (val % M * val % M * A % M) % M;
            if (curr_val < 0) {
                curr_val += M;
            }
            return (int) curr_val;
        }
    }
}

public class CountTotalSetBits {
    public int solve(int A) {
        int pow = -1;
        int X = A;
        if (X == 0)
            return 0;
        while (X > 0) {
            pow++;
            X = X >> 1;
        }
        int val = (int) Math.pow(2, pow);
        long total_bits = (long) (val / 2) * pow + (A - val + 1) + solve(A - val);

        return (int) (total_bits % 1000000007);
    }
}

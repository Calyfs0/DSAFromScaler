public class VeryLargePower {
    public int solve(int A, int B) {
        int mod = 1000000007;
        long factB = 1;
        for (int i = 1; i <= B; i++) {
            factB = (factB * i) % (mod - 1);

        }
        A = A % mod;
        return pow(A, factB, mod);
    }

    public int pow(int A, long B, int C) {
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        long val = pow(A, B / 2, C);

        if (B % 2 == 0) {
            long curr_val = (val % C * val % C) % C;
            if (curr_val < 0) {
                curr_val += C;
            }
            return (int) curr_val;
        } else {
            long curr_val = (val % C * val % C * A % C) % C;
            if (curr_val < 0) {
                curr_val += C;
            }

            return (int) curr_val;
        }

    }
}

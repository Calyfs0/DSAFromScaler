public class SmallestXOR {
    public int solve(int A, int B) {
        int xor = 0;

        for (int i = 30; i >= 0; i--) {
            if ((A & (1 << i)) > 0 && B > 0) {
                xor += 1 << i;
                B--;
            }
        }

        if (B > 0) {
            for (int i = 0; i < 31; i++) {
                if ((xor & (1 << i)) == 0 && B > 0) {
                    xor = xor | 1 << i;
                    B--;
                }
            }
        }

        return xor;

    }
}

public class DivideIntegerWithoutDivOrMulOrMod {
    public int divide(int A, int B) {

        long absA = Math.abs((long) A);
        long absB = Math.abs((long) B);
        long ans = 0;
        for (int i = 31; i >= 0; i--) {
            int val = (int) Math.pow(2, i);
            if (absB * val <= absA) {
                ans += val;
                absA -= absB * val;
            }
        }

        if (A < 0) {
            ans *= -1;
        }
        if (B < 0) {
            ans *= -1;
        }

        if (ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int) ans;
    }
}

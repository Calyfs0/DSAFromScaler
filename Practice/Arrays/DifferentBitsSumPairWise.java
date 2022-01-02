public class DifferentBitsSumPairWise {
    public int cntBits(int[] A) {

        long ans = 0;
        int mod = 1000000007;
        for (int i = 0; i < 32; i++) {
            long count = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) >= 1) {
                    count++;
                }
            }
            ans += 2 * count * (A.length - count);
            ans = ans % mod;
        }

        return (int) ans;
    }
}

public class AthMagicalNumber {
    public static int solve(int A, int B, int C) {

        long min = Math.min(B, C);
        int mod = 1000000007;
        long l = min;
        long r = min * A;
        long mid = (l + r) / 2;
        long ans = 0;
        long LCM = B * C / (long) GCD(B, C);
        while (l <= r) {
            long count = GetCount(mid, B, C, LCM);
            if (count == A) {
                ans = mid;
                r = mid - 1;
            } else if (count < A) {
                l = mid + 1;
            } else
                r = mid - 1;
            mid = (l + r) / 2;
        }

        return (int) (ans % mod);

    }

    public static long GetCount(long A, int B, int C, long LCM) {
        return A / B + A / C - A / LCM;
    }

    public static int GCD(int A, int B) {

        if (B == 0)
            return A;

        return GCD(B, A % B);
    }
}

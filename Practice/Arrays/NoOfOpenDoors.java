public class NoOfOpenDoors {
    public int solve(int A) {

        return GetSqrt(0, A, A);

    }

    public int GetSqrt(long low, long high, int N) {

        if (low <= high) {

            long mid = (low + high) / 2;
            long val = mid * mid;
            long val1 = (mid + 1) * (mid + 1);

            if ((val <= N)
                    && (val1 > N)) {
                return (int) mid;
            }

            else if (val < N) {
                return GetSqrt(mid + 1, high, N);
            } else {
                return GetSqrt(low, mid - 1, N);
            }
        }
        return (int) low;
    }
}

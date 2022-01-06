public class SpecialInteger {
    public static int solve(int[] A, int B) {

        int l = 1;
        int r = A.length;
        int mid = (l + r) / 2;
        int ans = 0;
        while (l <= r) {
            if (CheckSum(A, B, mid)) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;
            mid = (l + r) / 2;
        }

        return ans;
    }

    public static boolean CheckSum(int[] A, int B, int K) {
        long sum = 0;

        for (int i = 0; i < K; i++) {
            sum += (long) A[i];
        }
        if (sum > B)
            return false;

        for (int i = K; i < A.length; i++) {
            sum += (long) A[i] - A[i - K];
            if (sum > B)
                return false;
        }

        return true;
    }
}

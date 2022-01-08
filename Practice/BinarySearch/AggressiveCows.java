import java.util.Arrays;

public class AggressiveCows {
    public int solve(int[] A, int B) {
        Arrays.sort(A); // nlogn
        if (B == 2)
            return A[A.length - 1] - A[0];

        int l = 1;
        int r = A[A.length - 1] - A[0];
        long mid = ((long) l + r) / 2;
        int ans = 0;
        while (l <= r) { // O(log(range)*N)
            if (CheckMid(mid, A, B)) {
                ans = (int) mid;
                l = (int) mid + 1;
            } else
                r = (int) mid - 1;
            mid = ((long) l + r) / 2;
        }

        return ans;
    }

    // O(N)
    public boolean CheckMid(long mid, int[] A, int B) {
        int curr_cow = A[0];
        int cow = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - curr_cow >= mid) {
                cow++;
                curr_cow = A[i];
            }
            if (cow == B)
                return true;
        }

        return false;
    }
}

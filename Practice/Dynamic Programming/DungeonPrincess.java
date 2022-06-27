
import java.util.Arrays;

public class DungeonPrincess {
    public int calculateMinimumHP(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[n][m];

        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }

        return findAlivePath(A, 0, 0, n, m, dp);
    }

    public int findAlivePath(int[][] A, int r, int c, int n, int m, int[][] dp) {
        if (r == n - 1 && c == m - 1) {
            return 1 - Math.min(0, A[r][c]);
        }

        if (dp[r][c] != -1)
            return dp[r][c];

        int down = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        down = (r == n - 1) ? down : findAlivePath(A, r + 1, c, n, m, dp);
        right = (c == m - 1) ? right : findAlivePath(A, r, c + 1, n, m, dp);

        dp[r][c] = Math.max(1, Math.min(down, right) - A[r][c]);

        return dp[r][c];

    }
}

import java.util.Arrays;
public class Stairs {
    public static void main(String[] args) {
        int A = 10;
        int dp[] = new int[A + 1];
        Arrays.fill(dp, -1);

        Stairs stairs = new Stairs();
        int ans = stairs.ways(A, dp);
        System.out.println(ans);
    }

    public int ways(int A, int[] dp) {
        if (A == 0)
            return 1;
        if (A < 3)
            return A;

        if (dp[A] != -1)
            return dp[A];
        dp[A] = ways(A - 1, dp) + ways(A - 2, dp);
        return dp[A];
    }
}
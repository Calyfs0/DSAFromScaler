import java.util.Arrays;

public class LetsParty {
    public static void main(String[] args) {
        int A = 4;
        int mod = 10003;
        int[] dp = new int[A + 1];
        Arrays.fill(dp, -1);

        LetsParty letsParty = new LetsParty();
        int ans = letsParty.noOfWays(A, dp, mod);

        System.out.println(ans);

    }

    public int noOfWays(int A, int[] dp, int mod) {
        if (A < 3)
            return A;

        if (dp[A] != -1)
            return dp[A];
        dp[A] = (noOfWays(A - 1, dp, mod) + (noOfWays(A - 2, dp, mod) * (A - 1)) % mod) % mod;
        return dp[A];
    }
}

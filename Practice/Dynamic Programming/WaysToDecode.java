public class WaysToDecode {
    public static void main(String[] args) {
        WaysToDecode waysToDecode = new WaysToDecode();
        String A = "10";
        System.out.println(waysToDecode.numDecodings(A));
    }

    public int numDecodings(String A) {
        int[] dp = new int[A.length() + 1];
        int mod = 1000000007;
        if (A.charAt(0) == '0')
            return 0;
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= A.length(); i++) {
            if (A.charAt(i - 1) != '0')
                dp[i] = dp[i - 1] % mod;
            if (A.charAt(i - 2) == '1') {
                dp[i] = (dp[i] + dp[i - 2]) % mod;
            }
            if (A.charAt(i - 2) == '2' && A.charAt(i - 1) >= '1' && A.charAt(i - 1) <= '6')
                dp[i] = (dp[i] + dp[i - 2]) % mod;
        }

        return dp[A.length()];
    }
}

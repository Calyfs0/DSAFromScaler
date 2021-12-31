public class PairSumDivisibleByM {
    public int solve(int[] A, int B) {
        int[] freq = new int[B];

        for (int i = 0; i < A.length; i++) {
            int val = A[i] % B;
            freq[val] += 1;
        }
        long ans = 0;
        int n = (B - 1) / 2;
        ans += (long) freq[0] * (freq[0] - 1) / 2;
        for (int i = 1; i <= n; i++) {
            ans += (long) freq[i] * freq[B - i];
        }

        if (B % 2 == 0) {
            int left_index = (B / 2);
            ans += (long) freq[left_index] * (freq[left_index] - 1) / 2;
        }

        return (int) (ans % 1000000007);
    }
}

import java.util.Arrays;

public class MaxAndMinMagic {
    public int[] solve(int[] A) {
        Arrays.sort(A);
        int n = A.length / 2;
        int[] A1 = new int[n];
        int[] A2 = new int[n];
        int x = 0;
        int y = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                A1[x] = A[i];
                x++;
            } else {
                A2[y] = A[i];
                y++;
            }
        }
        int[] B = new int[2];
        int mod = 1000000007;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs((long) A1[i] - A2[i]);
        }
        B[1] = (int) (sum % mod);
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs((long) A2[n - i - 1] - A1[i]);
        }

        B[0] = (int) (sum % mod);

        return B;
    }
}

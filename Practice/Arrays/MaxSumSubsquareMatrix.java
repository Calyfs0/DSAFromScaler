public class MaxSumSubsquareMatrix {
    public int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < M; j++) {
                A[i][j] = A[i][j - 1] + A[i][j];
            }
        }

        for (int k = 0; k < N; k++) {
            for (int l = 1; l < M; l++) {
                A[l][k] = A[l - 1][k] + A[l][k];
            }
        }
        int max_value = A[B - 1][B - 1];
        int a1 = 0;

        for (int row = B - 1; row < N; row++) {
            int a2 = row;
            int b2 = B - 1;
            int b1 = 0;
            for (int col = B - 1; col < M; col++) {
                int curr_val = A[row][col];
                if (a1 > 0)
                    curr_val -= A[a1 - 1][b2];
                if (b1 > 0)
                    curr_val -= A[a2][b1 - 1];
                if (a1 > 0 && b1 > 0) {
                    curr_val += A[a1 - 1][b1 - 1];
                }
                max_value = Math.max(max_value, curr_val);
                b1++;
                b2++;

            }
            a1++;
        }

        return max_value;

    }
}
